package data;

import model.Flight;
import model.FlightCompany;
import model.FlightScale;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class DataReader {
    private static final String PATH = "./resources/flight.txt";
    public List<Flight> readFlightsFromFile(){
        List<Flight> flightList = new ArrayList<>();
        File file = new File(PATH);

        if(!file.exists()){
            System.out.println("Fisierul nu exista, verifica path-ul");
            return flightList;
        }

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try{
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while((line = bufferedReader.readLine()) != null){

                String[] words = line.split(",");

                String idToBeConverted = words[0].trim();
                String departureDateToBeConverted = words[1].trim();
                String returnDateToBeConverted = words[2].trim();
                String departureCity = words[3].trim();
                String arrivalCity = words[4].trim();
                String isLandedToBeConverted = words[5].trim();
                String isDelayedToBeConverted = words[6].trim();
                String priceToBeConverted = words[7].trim();
                String companyName = words[8].trim();


                FlightCompany flightCompany = null;
                for(FlightCompany fc: FlightCompany.values()){
                    if (fc.getDescription().equals(companyName)){
                        flightCompany = fc;
                    }
                }

                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
                LocalDateTime departureDate = LocalDateTime.parse(departureDateToBeConverted, dtf);
                LocalDateTime returnDate = LocalDateTime.parse(returnDateToBeConverted, dtf);

                int id = Integer.parseInt(idToBeConverted);
                boolean isLandedBoolean = Boolean.parseBoolean(isDelayedToBeConverted);
                boolean isDelayedBoolean = Boolean.parseBoolean(isLandedToBeConverted);
                double price = Double.parseDouble(priceToBeConverted);

                Flight flight = new Flight(id, departureDate, returnDate, departureCity, arrivalCity,
                        isLandedBoolean, isDelayedBoolean, price, flightCompany);
                flightList.add(flight);
            }

        }
        catch (IOException e){
            System.out.println("Nu s-a facut citirea");
        }
        finally {
            try{
                if(fileReader != null){
                    fileReader.close();
                }
                if(bufferedReader != null){
                    bufferedReader.close();
                }
            }
            catch (IOException e){

            }
        }
        return flightList;
    }
    public List<FlightScale> readFlightScaleFromFile(){
        List<FlightScale> flightScaleList = new ArrayList<>();
        File file = new File(PATH);

        if(!file.exists()){
            System.out.println("Fisierul nu exista, verifica path-ul");
            return flightScaleList;
        }

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try{
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while((line = bufferedReader.readLine()) != null){

                String[] words = line.split(",");

                if (words.length > 9) {
                    String idToBeConverted = words[0].trim();
                    String departureDateToBeConverted = words[1].trim();
                    String returnDateToBeConverted = words[2].trim();
                    String departureCity = words[3].trim();
                    String arrivalCity = words[4].trim();
                    String isLandedToBeConverted = words[5].trim();
                    String isDelayedToBeConverted = words[6].trim();
                    String priceToBeConverted = words[7].trim();
                    String companyName = words[8].trim();
                    String landingDateToBeConverted = words[9].trim();
                    String theNextFlightDateToBeConverted = words[10].trim();
                    String scaleCity = words[11].trim();
                    FlightCompany flightCompany = null;
                    for (FlightCompany fc : FlightCompany.values()) {
                        if (fc.getDescription().equals(companyName)) {
                            flightCompany = fc;
                        }
                    }

                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
                    LocalDateTime departureDate = LocalDateTime.parse(departureDateToBeConverted, dtf);
                    LocalDateTime returnDate = LocalDateTime.parse(returnDateToBeConverted, dtf);
                    LocalDateTime landingDate = LocalDateTime.parse(landingDateToBeConverted, dtf);
                    LocalDateTime theNextFlightDate = LocalDateTime.parse(theNextFlightDateToBeConverted, dtf);

                    int id = Integer.parseInt(idToBeConverted);
                    boolean isLandedBoolean = Boolean.parseBoolean(isDelayedToBeConverted);
                    boolean isDelayedBoolean = Boolean.parseBoolean(isLandedToBeConverted);
                    double price = Double.parseDouble(priceToBeConverted);

                    FlightScale flightScale = new FlightScale(id, departureDate, returnDate, departureCity, arrivalCity,
                            isLandedBoolean, isDelayedBoolean, price, scaleCity, landingDate, theNextFlightDate, flightCompany);
                    flightScaleList.add(flightScale);
                }
            }
        }
        catch (IOException e){
            System.out.println("Nu s-a facut citirea");
        }
        finally {
            try{
                if(fileReader != null){
                    fileReader.close();
                }
                if(bufferedReader != null){
                    bufferedReader.close();
                }
            }
            catch (IOException e){

            }
        }
        return flightScaleList;
    }

}