package Classes_and_objects;
class Movie {
    
    // static instance variable
    static String language="Thamizh";


    // Encapsu.....
    private String name;
    private String actor;
    private String actress;
    private String director;
    private byte hours;
    private byte mins;
    private byte sec;
    private float box_office_collec;


    //  constructors
    public Movie() {
    }


    //  getters...
    public String getName() {
        return name;
    }
    public String getActor() {
        return actor;
    }
    public String getActress() {
        return actress;
    }
    public String getDirector() {
        return director;
    }
    public byte getHours() {
        return hours;
    }
    public byte getMins() {
        return mins;
    }
    public byte getSec() {
        return sec;
    }
    public float getBox_office_collec() {
        return box_office_collec;
    }



    //   setters...
    public void setName(String name) {
        this.name = name;
    }
    public void setActor(String actor) {
        this.actor = actor;
    }
    public void setActress(String actress) {
        this.actress = actress;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setHours(byte hours) {
        this.hours = hours;
    }
    public void setMins(byte mins) {
        this.mins = mins;
    }
    public void setSec(byte sec) {
        this.sec = sec;
    }
    public void setBox_office_collec(float box_office_collec) {
        this.box_office_collec = box_office_collec;
    }


}
