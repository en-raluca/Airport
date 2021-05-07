package Model;

import Model.Flight;
import data.DataCreator;
import data.DataReader;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataReader dataReader = new DataReader();
        DataCreator dataCreator = new DataCreator();

        List<Flight> flightList = dataReader.readFlightsFromFile();
        List<Passenger> passengerList = dataCreator.somePassengerList();
        List<Reservation> reservationList = dataCreator.someListOfReservation();

        System.out.println("Flight list is: " + flightList);
        System.out.println("Passenger group list is: " + passengerList);
        System.out.println("Reservation list is: " + reservationList);
//
//        GenerateTrainingGroupFile generateTrainingGroupFile = new GenerateTrainingGroupFile();
//        generateTrainingGroupFile.generateTrainingGroupFile("");
    }

    public static Flight updateDepartureDate(List<Flight> flightList, int idOfTheFlightToBeUpdated, LocalDateTime updatedDate){
        Flight flightToBeUpdated = new Flight();
        for (Flight flight:flightList){
            if(flight.getId() == idOfTheFlightToBeUpdated) {
                flight.setDepartureDate(updatedDate);
                flightToBeUpdated = flight;
            }
        }
        return flightToBeUpdated;
    }

    public static Flight updateCompany(List<Flight> flightList, int idOfTheFlightToBeUpdated, String updatedCompany){
        Flight flightToBeUpdated = new Flight();
        for (Flight flight:flightList){
            if(flight.getId() == idOfTheFlightToBeUpdated) {
                flight.setDepartureDate(updatedDate);
                flightToBeUpdated = flight;
            }
        }
        return flightToBeUpdated;
    }

    public static Flight updateIsLanded(List<Flight> flightList, int idOfTheFlightToBeUpdated, boolean isLandedOrNot){
        Flight flightToBeUpdated = new Flight();
        for (Flight flight:flightList){
            if(flight.getId() == idOfTheFlightToBeUpdated) {
                flight.setLanded(isLandedOrNot);
                flightToBeUpdated = flight;
            }
        }
        return flightToBeUpdated;
    }

    public static Flight updatePrice(List<Flight> flightList, int idOfTheFlightToBeUpdated, double updatedPrice){
        Flight flightToBeUpdated = new Flight();
        for (Flight flight:flightList){
            if(flight.getId() == idOfTheFlightToBeUpdated) {
                flight.setPrice(updatedPrice);
                flightToBeUpdated = flight;
            }
        }
        return flightToBeUpdated;
    }

    public static Flight updateId(List<Flight> flightList, int idOfTheFlightToBeUpdated, int updatedId){
        Flight flightToBeUpdated = new Flight();
        for (Flight flight:flightList){
            if(flight.getId() == idOfTheFlightToBeUpdated) {
                flight.setId(updatedId);
                flightToBeUpdated = flight;
            }
        }
        return flightToBeUpdated;
    }





}