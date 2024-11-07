package Classes_and_objects;

class Flight 
{
    static String fuel="White petrol";

    private int flight_no;
    private String airline_name;
    private String color;
    private String flight_type;
    private short no_of_seats;
    private float fuel_qnt_ltrs;
    
    // constructor
    public Flight() {
    }


    // getters
    public int getFlight_no() {
        return flight_no;
    }
    public String getAirline_name() {
        return airline_name;
    }
    public String getColor() {
        return color;
    }
    public String getFlight_type() {
        return flight_type;
    }
    public short getNo_of_seats() {
        return no_of_seats;
    }
    public float getFuel_qnt_ltrs() {
        return fuel_qnt_ltrs;
    }

    //   setters...
    public void setFlight_no(int flight_no) {
        this.flight_no = flight_no;
    }
    public void setAirline_name(String airline_name) {
        this.airline_name = airline_name;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setFlight_type(String flight_type) {
        this.flight_type = flight_type;
    }
    public void setNo_of_seats(short no_of_seats) {
        this.no_of_seats = no_of_seats;
    }
    public void setFuel_qnt_ltrs(float fuel_qnt_ltrs) {
        this.fuel_qnt_ltrs = fuel_qnt_ltrs;
    }

}

