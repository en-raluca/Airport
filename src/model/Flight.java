package model;

import java.time.LocalDateTime;

public class Flight {
    private int id;
    private LocalDateTime departureDate;
    private LocalDateTime returnDate;
    private String departureCity;
    private String arrivalCity;
    private boolean isLanded;
    private boolean isDelayed;
    private double price;
    private FlightCompany company;

    public Flight(){
        
    }
    public Flight(int id, LocalDateTime departureDate, LocalDateTime returnDate, String departureCity,  String arrivalCity, boolean isLanded,
                  boolean isDelayed, double price, FlightCompany company){
        this.departureCity = departureCity;
        this.id = id;
        this.returnDate = returnDate;
        this.departureDate = departureDate;
        this.arrivalCity = arrivalCity;
        this.isLanded = isLanded;
        this.isDelayed = isDelayed;
        this.price = price;
        this.company = company;
    }

    public FlightCompany getCompany() {
        return company;
    }

    public void setCompany(FlightCompany company) {
        this.company = company;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public boolean getIsDelayed() {
        return isDelayed;
    }

    public void setDelayed(boolean delayed) {
        isDelayed = delayed;
    }

    public boolean getIsLanded() {
        return isLanded;
    }

    public LocalDateTime getDepartureDate() {
        return departureDate;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public void setDepartureDate(LocalDateTime departureDate) {
        this.departureDate = departureDate;
    }

    public void setLanded(boolean landed) {
        isLanded = landed;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public boolean equals(Object o){
        Flight flight = (Flight) o;
        if(flight.getId() == this.id) {return true;}
        return false;
    }

    @Override
    public  int hashCode(){
        int result = 1;
        int prim = 31;
        result = result * prim + id;
        return result;
    }

    @Override
    public String toString(){
        return "Id = " + id + ", arrival city: " + arrivalCity + ", departure date: " + departureDate + ", return date: "
                + returnDate + ", landed: " + isLanded + ", delayed: " + isDelayed + ", price: " + price + "\n";
    }


}
