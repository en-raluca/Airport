package manager;

import model.Passenger;

import java.util.List;

public class PassengerManager {
    public static Passenger findPassengerByCnp (String cnp, List<Passenger> passengerList){
        Passenger findThePassenger = new Passenger();
        for(Passenger p:passengerList){
            if(p.getCnp().equals(cnp)){
                findThePassenger = p;
            }
        }
        return findThePassenger;
    }

    public static boolean searchACertainPassenger(List<Passenger> passengerList, String name){
        boolean thereIsOrNotThisPassenger = false;
        for (Passenger p: passengerList){
            if(p.getName().equals(name)){
                thereIsOrNotThisPassenger = true;
            }
        }
        return thereIsOrNotThisPassenger;
    }

}
