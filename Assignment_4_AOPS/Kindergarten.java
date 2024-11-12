package Assignment_4_AOPS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Kindergarten {

    static Map<Character, String> my_map = new HashMap<>();
    static {
        my_map.put('V', "violet");
        my_map.put('C', "clover");
        my_map.put('G', "grass");
        my_map.put('R', "radish");
    }

    public static void getTheirPlants(String garden,String name)
    {
        int a=(name.charAt(0)-65)*2;
        System.out.println(my_map.get(garden.charAt(a)) +" " + 
                           my_map.get(garden.charAt(a+1)) +" " +
                           my_map.get(garden.charAt(a+ 24))+" " + 
                           my_map.get(garden.charAt(a+ 25))
                           );

    }
    public static void main(String[] args) {
        
        // String[] names={"Alice", "Bob", "Charlie", "David", "Eve", "Fred", "Ginny", "Harriet", "Ileana", "Joseph", "Kincaid","Larry"};
        // for(int i=0;i<12;i++)
        // {
        //     getTheirPlants("VRCGVVRVCGGCCGVRGCVCGCGVVRCCCGCRRGVCGCRVVCVGCGCV",names[i].toUpperCase());
        // }

        System.out.println("Enter to garden string:");
        System.out.println("(For example:VRCGVVRVCGGCCGVRGCVCGCGVVRCCCGCRRGVCGCRVVCVGCGCV)");

        Scanner sc=new Scanner(System.in);
        String garden=sc.nextLine();  
        // String garden="VRCGVVRVCGGCCGVRGCVCGCGVVRCCCGCRRGVCGCRVVCVGCGCV";

        System.out.println("Enter the name from the list: ");
        System.out.println("Alice, Bob, Charlie, David, Eve, Fred, Ginny, Harriet, Ileana, Joseph, Kincaid, and Larry");

        String name=sc.next();

        getTheirPlants(garden.toUpperCase(), name.toUpperCase());
        sc.close();
    }
}