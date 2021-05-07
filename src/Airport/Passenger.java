package Airport;

public class Passenger {
    private String cnp;
    private String name;
    private int age;

    @Override
    public String toString(){
        return "Passenger id: " + cnp + ", name: "+ name +
                ", age: " + age;
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
