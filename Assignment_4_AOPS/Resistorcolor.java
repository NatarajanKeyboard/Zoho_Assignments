package Assignment_4_AOPS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Resistorcolor {
    public static Map<String,Integer> my=new HashMap<>();
    static
    {   my.put("black",0);
        my.put("brown",1);
        my.put("red",2);
        my.put("orange",3);
        my.put("yellow",4);
        my.put("green",5);
        my.put("blue",6);
        my.put("violet",7);
        my.put("grey",8);
        my.put("white",9);
    }
    public static void main(String[] args) {
        
       

        Scanner sc=new Scanner(System.in);
        System.out.println(my.get(sc.next()));

        sc.close();
    }
}
