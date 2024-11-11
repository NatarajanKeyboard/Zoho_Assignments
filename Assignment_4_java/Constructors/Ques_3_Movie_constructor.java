package Constructors;

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




    // parameterized constructors
    public Movie(String name, String actor, String actress, String director, byte hours, byte mins, byte sec,
            float box_office_collec) 
    {
        this.name = name;
        this.actor = actor;
        this.actress = actress;
        this.director = director;
        this.hours = hours;
        this.mins = mins;
        this.sec = sec;
        this.box_office_collec = box_office_collec;
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

    // dislays all the employees of a given employees table
    public static void displayAllMovies(Movie[] movies_list)
    {
        for(int i=0;i<10;i++)
        {
           System.out.println(movies_list[i].display());

        }

    }

    // displays a single entity (i.e) employee
    public String display()
    {
        return  "Movie    : "+this.name+
                "\nLanguage : "+language+
                "\nActor    : "+this.actor+
                "\nActress  : "+this.actress+
                "\nDirector : "+this.director+
                "\nDuration : "+this.hours+":"+this.mins+":"+this.sec+
                "\nBox office_collection : "+this.box_office_collec+ 
                "\n\n";            
    }



}


public class Ques_3_Movie_constructor {
    public static void main(String[] args) {
        
        Movie[] movies_List=new Movie[10];
        
        for(int i=0;i<10;i++)
        {
            movies_List[i]=new Movie("Movie"+i,"actor"+i,"actress"+i,"director"+i,(byte)2,(byte)30,(byte)35,2500_00_00_000F);

        }

        Movie.displayAllMovies(movies_List);

    }
    
}
