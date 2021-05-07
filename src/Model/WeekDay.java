package Model;

public enum WeekDay{
        MONDAY(1,"Mon"),
        TUESDAY(2,"Tue"),
        WEDNESDAY(3, "Wed"),
        THURSDAY(4, "Thu"),
        FRIDAY(5, "Fri"),
        SATURDAY(6, "Sat"),
        SUNDAY(7, "Sun");

        private int code;
        private String description;
        WeekDay (int code, String description){
            this.code = code;
            this.description = description;
        }

    public int getCode() {return code;}

    public String getDescription() {return description;}

}

