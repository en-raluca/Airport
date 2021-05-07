package Model;

import java.time.LocalDateTime;

//public class FlightScale extends Flight implements Discountable{
public class FlightScale extends Flight{
    private String scaleCity;
    private LocalDateTime landingDate;
    private LocalDateTime theNextFlightDate;

    public FlightScale(int id, LocalDateTime departureDate, LocalDateTime returnDate, String departureCity,
                       String arrivalCity, boolean isLanded, boolean isDelayed, double price,
                       String scale, LocalDateTime landingDate, LocalDateTime theNextFlightDate) {
        super(id, departureDate, returnDate, departureCity,  arrivalCity, isLanded, isDelayed, price);
        this.theNextFlightDate = theNextFlightDate;
        this.landingDate = landingDate;
        this.scaleCity = scale;
    }

    public LocalDateTime getLandingDate() {
        return landingDate;
    }

    public void setLandingDate(LocalDateTime landingDate) {
        this.landingDate = landingDate;
    }

    public String getScaleCity() {
        return scaleCity;
    }

    public void setScaleCity(String scaleCity) {
        this.scaleCity = scaleCity;
    }

    public LocalDateTime getTheNextFlightDate() {
        return theNextFlightDate;
    }

    public void setTheNextFlightDate(LocalDateTime theNextFlightDate) {
        this.theNextFlightDate = theNextFlightDate;
    }

//    @Override
//    public void applyDiscount(int percent){
//        double actualPrice = getPrice();
//        double newPrice = actualPrice - (actualPrice * percent / 100);
//        setPrice(newPrice);
//    }
}
