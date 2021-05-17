package manager;

import model.Flight;
import model.FlightCompany;
import model.FlightScale;
import model.Reservation;
import java.time.LocalDateTime;
import java.util.*;

public class FlightManager {

    public void updateDepartureDate(List<Flight> flightList, int idOfTheFlightToBeUpdated, LocalDateTime updatedDate) {
        for (Flight flight : flightList) {
            if (flight.getId() == idOfTheFlightToBeUpdated) {
                flight.setDepartureDate(updatedDate);
            }
        }
    }

    public void updateIsLanded(List<Flight> flightList, int idOfTheFlightToBeUpdated, boolean isLandedOrNot) {
        for (Flight flight : flightList) {
            if (flight.getId() == idOfTheFlightToBeUpdated) {
                flight.setLanded(isLandedOrNot);
            }
        }
    }

    public void updatePrice(List<Flight> flightList, int idOfTheFlightToBeUpdated, double updatedPrice){
        for (Flight flight:flightList){
            if(flight.getId() == idOfTheFlightToBeUpdated) {
                flight.setPrice(updatedPrice);
            }
        }
    }

    public void updateId(List<Flight> flightList, int idOfTheFlightToBeUpdated, int updatedId){
        for (Flight flight:flightList){
            if(flight.getId() == idOfTheFlightToBeUpdated) {
                flight.setId(updatedId);
            }
        }
    }

    public static Flight findFlightById (int id, List<Flight> flightList){
        Flight findTheFlight = new Flight();
        for(Flight f:flightList){
            if(f.getId() == id){
                findTheFlight = f;
            }
        }
        return findTheFlight;
    }

    public static boolean searchAFlightByDepartureCity(List<Flight> flightList, String departureCity){
        boolean thereIsAFlightWithThisDepartureCity = false;
        for (Flight f:flightList){
            if(f.getDepartureCity().equals(departureCity)){
                thereIsAFlightWithThisDepartureCity = true;
            }
        }
        return thereIsAFlightWithThisDepartureCity;
    }

    public static boolean searchAFlightWithASpecificScaleCity(List<FlightScale> flightScaleList, String scaleCity){
        boolean therIsASclaeFlightWithThisSpecificScaleCity = false;
        for (FlightScale fs:flightScaleList){
            if (fs.getScaleCity().equals(scaleCity)){
                therIsASclaeFlightWithThisSpecificScaleCity = true;
            }
        }
        return therIsASclaeFlightWithThisSpecificScaleCity;
    }

    public static boolean searchAFlightWithDepartureDateLaterThenAParameter(List<Flight> flightList, LocalDateTime specificDate){
        boolean thereIsAFlightWithDepartureDateLaterThenAParameter = false;
        for(Flight f:flightList){
            if(f.getDepartureDate().isAfter(specificDate))
                thereIsAFlightWithDepartureDateLaterThenAParameter = true;
        }
        return thereIsAFlightWithDepartureDateLaterThenAParameter;
    }

    public static boolean searchAFlightThatIsCheaperThanThePrice(double price, List<Flight> flightList){
        boolean thereIsOrNotAFlightThatIsCheaperThanThePrice = false;
        for(Flight f:flightList){
            if(f.getPrice() < price)
                thereIsOrNotAFlightThatIsCheaperThanThePrice = true;
        }
        return thereIsOrNotAFlightThatIsCheaperThanThePrice;
    }

    public static Flight findTeCheapestFlightScale(List<FlightScale> flightScaleList){
        FlightScale cheapestFlight = flightScaleList.get(0);
        for(FlightScale f:flightScaleList){
            if(f.getPrice() < cheapestFlight.getPrice())
                cheapestFlight = f;
        }
        return cheapestFlight;
    }

    public static List<Flight> filterFlightListFromACertainCompany(List<Flight> flightList, String company){
        List<Flight> flightsFromACertainCompany = new ArrayList<>();
        for(Flight f:flightList){
            if(f.getCompany().getDescription().equals(company)){
                flightsFromACertainCompany.add(f);
            }
        }
        return  flightsFromACertainCompany;
    }

    public static List<Flight> filterFlightListCheaperFromAPrice(List<Flight> flightList, double price){
        List<Flight> flightsFromACertainCompany = new ArrayList<>();
        for(Flight f:flightList){
            if(f.getPrice() <= price){
                flightsFromACertainCompany.add(f);
            }
        }
        return  flightsFromACertainCompany;
    }

    public static List<Flight> filterFlightListWithTheSameDestinationCity(List<Flight> flightList, String arrivalCity){
        List<Flight> flightsFromACertainCompany = new ArrayList<>();
        for(Flight f:flightList){
            if(f.getArrivalCity().equals(arrivalCity)){
                flightsFromACertainCompany.add(f);
            }
        }
        return  flightsFromACertainCompany;
    }

    public void updateCompany(List<Flight> flightList, int idOfTheFlightToBeUpdated, FlightCompany updatedCompany){
        for (Flight flight:flightList){
            if(flight.getId() == idOfTheFlightToBeUpdated) {
                flight.setCompany(updatedCompany);
            }
        }
    }

    public static List<Flight> filterFlightListWithThePRiceBetweenSomething(List<Flight> flightList, double price1, double price2){
        List<Flight> flightsFromACertainCompany = new ArrayList<>();
        for(Flight f:flightList){
            if(price1 <= f.getPrice() && f.getPrice() <= price2){
                flightsFromACertainCompany.add(f);
            }
        }
        return  flightsFromACertainCompany;
    }

    public static List<FlightScale> filterFlightListWithTheSameScaleCity(List<FlightScale> flightScaleList, String scaleCity){
        List<FlightScale> flightsWithACertainCity = new ArrayList<>();
        for(Flight f:flightScaleList){
            if(f instanceof FlightScale) {
                FlightScale flightScale = (FlightScale) f;
                if (flightScale.getScaleCity().equals(scaleCity)) {
                    flightsWithACertainCity.add(flightScale);
                }
            }
        }
        return flightsWithACertainCity;
    }

    public Map<Flight, Integer>extractNrOfReservationPerFlight(List<Flight> flightList, List<Reservation> reservationList){
        Map<Flight, Integer> resultMp = new HashMap<>();
        for(Flight f:flightList){
            int nrReservationsPerFlight = 0;
            for(Reservation r:reservationList){
                if(r.getFlightId() == f.getId()){
                    nrReservationsPerFlight++;
                }
            }
            resultMp.put(f, nrReservationsPerFlight);
        }
        return resultMp;
    }

    public Map<String,Integer> extractTheNumberOfReservationsPerCity(List<Flight> flightList, List<Reservation> reservationList){
        Map<String, Integer> resultMp = new HashMap<>();
        for(Flight f:flightList){
            int nrPassenger = 0;
            for(Reservation r: reservationList){
                if(r.getFlightId() == f.getId())
                    nrPassenger += r.getPassengersMap().keySet().size();
            }
            String city = f.getArrivalCity();
            if(resultMp.containsKey(city)){
                int nrActualNumber = resultMp.get(city) + nrPassenger;
                resultMp.put(city, nrActualNumber);
            }
            else {
                resultMp.put(f.getArrivalCity(), nrPassenger);
            }
        }
        return resultMp;
    }

    public Map<Integer, Integer> extractNrOfPassengersPerFlight(List<Flight>flightList, List<Reservation> reservationList){
        Map<Integer, Integer> resultMp = new HashMap<>();
        for(Flight f: flightList){
            int nrPassenger = 0;
            for(Reservation r: reservationList){
                if(r.getFlightId() == f.getId()){
                    nrPassenger += r.getPassengersMap().keySet().size();
                }
            }
            resultMp.put(f.getId(), nrPassenger);
        }
        return resultMp;
    }


    public void addAFlight(List<Flight> flightList, Flight newFlight){
        flightList.add(newFlight);
    }

    public void removeAFlightById(int flightId, List<Flight> flightList){
        Flight flightToBeRemoved = null;
        for(Flight f:flightList){
            if(f.getId() == flightId){
                flightToBeRemoved = f;
            }
        }
        flightList.remove(flightToBeRemoved);
    }

    public void removeFlight(List<Flight> flightList, Flight flightToBeDeleted){
        Iterator<Flight> iterator = flightList.iterator();
        while (iterator.hasNext()){
            Flight flight = iterator.next();
            if(flight.getId() == flightToBeDeleted.getId()){
                flightList.remove(flight);
            }
        }
    }
}
