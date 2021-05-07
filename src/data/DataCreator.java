package data;

import Model.Passenger;
import Model.Reservation;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataCreator {
    public List<Passenger> somePassengerList() {

        Passenger p1 = new Passenger("1970909270320", "Havarneanu Matei", 23);
        Passenger p2 = new Passenger("2970409270021", "Vasile", 23);
        Passenger p3 = new Passenger("1970409270320", "Lala", 24);
        Passenger p4 = new Passenger("2970409270021", "Vivi", 25);
        Passenger p5 = new Passenger("1970909270320", "Sylvester", 26);
        Passenger p6 = new Passenger("2970509270021", "Stalone", 27);
        Passenger p7 = new Passenger("1970609270320", "George", 28);
        Passenger p8 = new Passenger("2970709270021", "Lili", 29);
        Passenger p9 = new Passenger("1970809270320", "Vasilescu", 20);
        Passenger p10 = new Passenger("2972909270021", "Matei", 23);
        Passenger p11 = new Passenger("1973909273020", "Mimi", 31);
        Passenger p12 = new Passenger("2970909273021", "Gabriel", 65);
        Passenger p13 = new Passenger("1970939270320", "Sisi", 25);
        Passenger p14 = new Passenger("2970959270021", "Silvia", 56);
        Passenger p15 = new Passenger("1970906270320", "Alexandra", 43);

        List<Passenger> passengerList = new ArrayList<>();

        passengerList.add(p1);
        passengerList.add(p2);
        passengerList.add(p3);
        passengerList.add(p4);
        passengerList.add(p5);
        passengerList.add(p6);
        passengerList.add(p7);
        passengerList.add(p8);
        passengerList.add(p9);
        passengerList.add(p10);
        passengerList.add(p11);
        passengerList.add(p12);
        passengerList.add(p13);
        passengerList.add(p14);
        passengerList.add(p15);

        return passengerList;
    }

    public List<Reservation> someListOfReservation(){

        LocalDateTime d1 = LocalDateTime.parse("2015-02-20T06:30:00");
        LocalDateTime d2 = LocalDateTime.parse("2015-03-20T06:30:00");
        LocalDateTime d3 = LocalDateTime.parse("2015-04-20T06:30:00");
        LocalDateTime d4 = LocalDateTime.parse("2015-05-20T06:30:00");
        LocalDateTime d5 = LocalDateTime.parse("2015-06-20T06:30:00");
        LocalDateTime d6 = LocalDateTime.parse("2015-07-20T06:30:00");
        LocalDateTime d7 = LocalDateTime.parse("2015-08-20T06:30:00");
        LocalDateTime d8 = LocalDateTime.parse("2015-09-20T06:30:00");
        LocalDateTime d9 = LocalDateTime.parse("2015-12-20T06:30:00");
        LocalDateTime d10 = LocalDateTime.parse("2015-11-20T06:30:00");

        Map<String, String> passengerPlacesInFlight = new HashMap<>();

        passengerPlacesInFlight.put("Havarneanu Matei", "1a");
        passengerPlacesInFlight.put("Vasile", "2a");
        passengerPlacesInFlight.put("Lala", "3a");
        passengerPlacesInFlight.put("Vivi", "4a");
        passengerPlacesInFlight.put("Sylvester", "5a");
        passengerPlacesInFlight.put("Stalone", "6a");
        passengerPlacesInFlight.put("George", "7a");
        passengerPlacesInFlight.put("Lili", "8a");
        passengerPlacesInFlight.put("Vasilescu", "9a");
        passengerPlacesInFlight.put("Matei", "22a");
        passengerPlacesInFlight.put("Mim", "21a");
        passengerPlacesInFlight.put("Gabriel", "23a");
        passengerPlacesInFlight.put("Sisi", "24a");
        passengerPlacesInFlight.put("Silvia", "25a");
        passengerPlacesInFlight.put("Alexandra", "26a");

        Reservation r1 = new Reservation(1, 10234, 234.3, d1, passengerPlacesInFlight);
        Reservation r2 = new Reservation(2, 27680, 234.3, d2, passengerPlacesInFlight);
        Reservation r3 = new Reservation(3, 27690, 234.3, d3, passengerPlacesInFlight);
        Reservation r4 = new Reservation(4, 27890, 234.3, d4, passengerPlacesInFlight);
        Reservation r5 = new Reservation(5, 276890, 234.3, d5, passengerPlacesInFlight);
        Reservation r6 = new Reservation(6, 26890, 234.3, d6, passengerPlacesInFlight);
        Reservation r7 = new Reservation(7, 27689, 234.3, d7, passengerPlacesInFlight);
        Reservation r8 = new Reservation(8, 76890, 234.3, d8, passengerPlacesInFlight);
        Reservation r9 = new Reservation(9, 27890, 234.3, d9, passengerPlacesInFlight);
        Reservation r10 = new Reservation(10, 2768, 234.3, d10, passengerPlacesInFlight);

        List<Reservation> reservationList = new ArrayList<>();

        reservationList.add(r1);
        reservationList.add(r2);
        reservationList.add(r3);
        reservationList.add(r4);
        reservationList.add(r5);
        reservationList.add(r6);
        reservationList.add(r7);
        reservationList.add(r8);
        reservationList.add(r9);
        reservationList.add(r10);

        return reservationList;
    }
}
