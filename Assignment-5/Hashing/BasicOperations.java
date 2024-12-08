// package Hashing;

import java.util.HashMap;

public class BasicOperations {

    public static void main(String[] args) {
        HashMap<String,Character> myMap=new HashMap<>();
        
        myMap.put("Natarajan",'B');
        myMap.put("Thamaraisan", 'C');
        myMap.put("MrSomeOne", 'A');
        myMap.put("MsSomeOne", 'C');
        myMap.put("Natarajan",'A'); //collision

        System.out.println("\u00007");
        System.out.println(myMap);
        // collisions are handled by replacing the entry
    }
}