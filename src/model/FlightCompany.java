package model;

public enum FlightCompany{
    QATAR(1,"Qatar Airways"),
    SINGAPORE(2,"Singapore Airlines"),
    EMIRATES(3, "Emirates"),
    EVA_AIRLINES(4, "EVA Air"),
    HAINAN_AIRLINES(5, "Hainan Airlines"),
    QANTAS_AIRWAYS(6, "Qantas Airways");

    private int code;
    private String description;
    FlightCompany (int code, String description){
        this.code = code;
        this.description = description;
    }

    public int getCode() {return code;}

    public String getDescription() {return description;}
}

