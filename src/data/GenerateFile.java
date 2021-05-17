package data;

import model.Reservation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class GenerateFile {
    public void generateFile(Reservation reservation){

        String directoryName = "./resources";
        String fileName = "/reservation" + reservation.getReservationId() + ".txt";
        File dir = new File(directoryName);

        if(!dir.exists()){
            dir.mkdir();
        }

        File file = new File(dir, fileName);

        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("nu s_a reusit crearea de fisier");
            }
        }
        FileWriter fw = null;
        BufferedWriter bw = null;
        try{
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            bw.write("Idul rezervarii: " + reservation.getReservationId());
            bw.newLine();
            bw.write("Flight id: " + reservation.getFlightId());
            bw.newLine();
            bw.write("Full Price: " + reservation.getFullPrice());
            bw.newLine();
            bw.write("Reservation date: " + reservation.getReservationDate());
            bw.newLine();
            for(Map.Entry<String, String> entry : reservation.getPassengersMap().entrySet())
            {
                bw.write("Name: " + entry.getKey());
                bw.write(", Seat: " + entry.getValue());
                bw.newLine();
            }
            bw.flush();
        }
        catch (IOException e){
            System.out.println("Nu s-a reusit scrierea in fisier");
        }
        finally {
            try{
                if(fw != null){
                    fw.close();
                }
                if(bw != null){
                    bw.close();
                }
            }
            catch (IOException e){

            }
        }
    }
}
