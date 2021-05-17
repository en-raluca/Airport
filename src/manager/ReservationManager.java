package manager;

import model.Passenger;
import model.Reservation;

import java.time.LocalDateTime;
import java.util.*;

public class ReservationManager {
    public static Reservation findReservationById (int id, List<Reservation> reservationList){
        Reservation findTheReservation = new Reservation();
        for(Reservation r:reservationList){
            if(r.getReservationId() == id){
                findTheReservation = r;
            }
        }
        return findTheReservation;
    }

    public static Reservation theMostExpensiveReservation(List<Reservation> reservationList){
        Reservation theMostExpensiveReservation = reservationList.get(0);
        for (Reservation r: reservationList){
            if(r.getFullPrice() > theMostExpensiveReservation.getFullPrice()){
                theMostExpensiveReservation = r;
            }
        }
        return theMostExpensiveReservation;
    }

    public static List<Reservation> filterFutureReservations(List<Reservation> reservationList){
        List<Reservation> futureReservation = new ArrayList<>();
        for(Reservation r: reservationList){
            if(r.getReservationDate().isAfter(LocalDateTime.now())){
                futureReservation.add(r);
            }
        }
        return futureReservation;
    }

    public static List<Reservation> filterReservationOfACertainFlight(List<Reservation> reservationList, int flightId){
        List<Reservation> reservationForTheSameFlight = new ArrayList<>();
        for(Reservation r: reservationList){
            if(r.getFlightId() == flightId){
                reservationForTheSameFlight.add(r);
            }
        }
        return reservationForTheSameFlight;
    }

    public Map<String, List<Integer>> extractReservationsPerPassenger(List<Passenger> passengerList, List<Reservation> reservationList){
        Map<String, List<Integer>> resultMp = new HashMap<>();
        for(Passenger p:passengerList){
            List<Integer> passengersReservationIdList = new ArrayList<>();
            for(Reservation r: reservationList){
                Map<String, String> passengersMap = r.getPassengersMap();
                if(passengersMap.containsKey(p.getName())){
                    passengersReservationIdList.add(r.getReservationId());
                }
            }
            resultMp.put(p.getName(), passengersReservationIdList);
        }
        return resultMp;
    }
}
