package model;

import java.time.LocalDateTime;
import java.util.Map;

public class Reservation {
    private int reservationId;
    private int flightId;
    private double fullPrice;
    private LocalDateTime reservationDate;
    private Map<String,String> passengersMap;
    public Reservation(){}
    public Reservation(int reservationId, int flightId, double fullPrice, LocalDateTime reservationDate, Map<String,String> passengersMap){
        this.reservationId = reservationId;
        this.flightId = flightId;
        this.fullPrice = fullPrice;
        this.reservationDate = reservationDate;
        this.passengersMap = passengersMap;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public Map<String, String> getPassengersMap() {
        return passengersMap;
    }

    public void setPassengersMap(Map<String, String> passengersMap) {
        this.passengersMap = passengersMap;
    }

    public LocalDateTime getReservationDate() {
        return reservationDate;
    }

    public double getFullPrice() {
        return fullPrice;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setReservationDate(LocalDateTime reservationDate) {
        this.reservationDate = reservationDate;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public void setFullPrice(double fullPrice) {
        this.fullPrice = fullPrice;
    }

    @Override
    public String toString(){
        return "Reservation id: " + reservationId + ", flight id: "+ flightId +
            ", date: " + reservationDate + "price: " + fullPrice + "\n";
    }

    @Override
    public boolean equals(Object o){
        Flight flight = (Flight) o;
        if(flight.getId() == this.reservationId) {return true;}
        return false;
    }

}

