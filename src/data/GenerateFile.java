package data;

import Airport.Reservation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GenerateFile {
    public static void main(String[] args){

        String directoryName = "./resources";
        String fileName = "/reservation.txt";
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
            bw.write("Cluj");
            bw.newLine();
            bw.write("Bucuresti");
            bw.newLine();

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
