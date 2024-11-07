package Classes_and_objects;

import java.util.List;
import java.util.ArrayList;

class teams{

    //   properties (Encapsu...)
    private String name;
    private String city;
    private String division;

    private List<players> ls=new ArrayList<>();


    
    //  constructor
    public teams(String name, String city, String division) {
        this.name = name;
        this.city = city;
        this.division = division;
    }


    //  getters
    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }
    public String getDivision() {
        return division;
    }
    


    //   setters...
    public void setName(String name) {
        this.name = name;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setDivision(String division) {
        this.division = division;
    }

     
    // behaviours...
    public void playGame()
    {}
    public void hireCoach()
    {}

    // Methods to manage players 
    // to add a new player
    public void addPlayer(players player)      
    {
        ls.add(player); 
    } 

    // to remove a player
    public void removePlayer(players player) 
    {   
        ls.remove(player); 
    } 

    // to show the players list field
    public List<players> getPlayers()
    {
        return ls;
    }
}




class players
{
    // Properties  (Encapsu...)
    private String name;
    private String position;
    private int jerseyNumber;


    //   getters...
    public String getName() {
        return name;
    }
    public String getPosition() {
        return position;
    }
    public int getJerseyNumber() {
        return jerseyNumber;
    } 

    // setters...
    public void setName(String name) {
        this.name = name;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }


    //   Behaviours
    public void playGame()
    {}
    public void train()
    {}

      
}

// public class Ques_5_teams_and_players
// {
//     public static void main(String[] args) {
//         players p1=new players();   p1.setName("hello");    p1.setPosition("1");  p1.setJerseyNumber(10);
//         players p2=new players();   p2.setName("world");    p2.setPosition("2");  p2.setJerseyNumber(20);
//         players p3=new players();   p3.setName("progr");    p3.setPosition("3");  p3.setJerseyNumber(30);

//         players[] p=new players[3];
//         p[0]=p1;
//         p[1]=p2;
//         p[2]=p3;
//         for(int i=0;i<p.length;i++)
//         {
//         System.out.println(p[i].getName()+" "+p[i].getPosition()+" "+p[i].getJerseyNumber());
//         }

//         players p4=new players();
//         players p5=new players();
//         players p6=new players();

//     }
// }


