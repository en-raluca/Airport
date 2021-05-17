import data.*;
import manager.PassengerManager;
import manager.FlightManager;
import manager.ReservationManager;
import model.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static Object List;

    public static void main(String[] args) {

        DataReader dataReader = new DataReader();
        DataCreator dataCreator = new DataCreator();
        GenerateFile generateFile = new GenerateFile();

        List<Reservation> allReservations = dataCreator.someListOfReservation();
        for (Reservation reservation:allReservations){ generateFile.generateFile(reservation); }

        List<Flight> flightList = dataReader.readFlightsFromFile();
        List<FlightScale> flightScaleList = dataReader.readFlightScaleFromFile();
        List<Passenger> passengerList = dataCreator.somePassengerList();
        List<Reservation> reservationList = dataCreator.someListOfReservation();

        System.out.println("Flight list is: \n" + flightList);
        System.out.println("Passenger group list is: \n" + passengerList);
        System.out.println("Reservation list is: \n" + reservationList);

        PassengerManager passengerManager = new PassengerManager();
        FlightManager flightManager = new FlightManager();
        ReservationManager reservationManager = new ReservationManager();

        Passenger foundOrNot = PassengerManager.findPassengerByCnp("1970909270320", passengerList);
        System.out.println("The data you asked for: \n" + foundOrNot);

        boolean isThereThisPassenger = PassengerManager.searchACertainPassenger(passengerList, "Sylvester");
        System.out.println("Is it true that there is this passenger: " + isThereThisPassenger);

        Flight thisIsTheFlight = FlightManager.findFlightById(8633454, flightList);
        System.out.println("This is the flight you demanded: \n" + thisIsTheFlight);

        List<FlightScale> flightsWithSameScaleCity = FlightManager.filterFlightListWithTheSameScaleCity(flightScaleList, "London");
        System.out.println("These are the flights: \n" + flightsWithSameScaleCity);

        List<Flight> flightsBetweenSomePrices = FlightManager.filterFlightListWithThePRiceBetweenSomething(flightList, 50, 400);
        System.out.println("These are the flights with the prices between something: \n" + flightsBetweenSomePrices);

        List<Flight> flightsWithTheSameDestinations = FlightManager.filterFlightListWithTheSameDestinationCity(flightList, "Roma");
        System.out.println("These are the flights with the same destination: \n" + flightsWithTheSameDestinations);

        List<Flight> sameCompanyFlights = FlightManager.filterFlightListFromACertainCompany(flightList, "Qatar Airways");
        System.out.println("These are the flights with the same company airlines:\n" + sameCompanyFlights);

        List<Flight> filterCheaperFlights = FlightManager.filterFlightListCheaperFromAPrice(flightList, 50);
        System.out.println("These are the cheaper ones:\n" + filterCheaperFlights);

        flightManager.updateCompany(flightList, 1026734, FlightCompany.SINGAPORE );
        System.out.println("This is the flight list before:" + flightList);
        flightManager.removeAFlightById(1026734, flightList);
        System.out.println("This is the new list of flights:" + flightList);

        boolean isThereAFlightByThisDepartureCity = FlightManager.searchAFlightByDepartureCity(flightList, "Iasi");
        System.out.println(isThereAFlightByThisDepartureCity);
        LocalDateTime aSpecificDate = LocalDateTime.parse("2009-02-20T06:30:00");

        boolean isThereAFlightWithDepartureDateLaterThenAParameter = FlightManager.searchAFlightWithDepartureDateLaterThenAParameter(flightList, aSpecificDate);
        System.out.println(isThereAFlightWithDepartureDateLaterThenAParameter);

        boolean thereIsAFlightWithASpecificScaleCity = FlightManager.searchAFlightWithASpecificScaleCity(flightScaleList, "Barcelona");
        System.out.println(thereIsAFlightWithASpecificScaleCity);

        Flight findTheCheapest = FlightManager.findTeCheapestFlightScale(flightScaleList);
        System.out.println("This is the cheapest flight: " + findTheCheapest);

        boolean thereIsAFlightThatIsCheaperThanThePrice = FlightManager.searchAFlightThatIsCheaperThanThePrice(34,flightList);
        System.out.println(thereIsAFlightThatIsCheaperThanThePrice);

        Map<String, List<Integer>> mapOfReservations = reservationManager.extractReservationsPerPassenger(passengerList, reservationList);
        System.out.println(mapOfReservations);
    }
}