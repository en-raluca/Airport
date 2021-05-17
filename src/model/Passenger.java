package model;

import java.util.Objects;

public class Passenger {
    private String cnp;
    private String name;
    private int age;
    public Passenger(){}
    @Override
    public String toString(){
        return "Passenger id: " + cnp + ", name: "+ name +
                ", age: " + age + "\n";
    }

    @Override
    public boolean equals(Object o) {
        Passenger passenger = (Passenger) o;
        if(passenger.getCnp().equals(this.cnp)) return true;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cnp);
    }

    public Passenger(String cnp, String name, int age){
        this.age = age;
        this.cnp = cnp;
        this.name = name;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
