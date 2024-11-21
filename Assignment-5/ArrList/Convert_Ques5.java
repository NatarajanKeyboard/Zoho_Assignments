package ArrList;

import java.util.ArrayList;
import java.util.Arrays;

public class Convert_Ques5 {
    public static void main(String[] args) {//to show the .toArray(new String[0]) and .asList()
        
        ArrayList<String> arr=new ArrayList<>();
        arr.add("apple");
        arr.add("banana");
        arr.add("cherry");

        // Converting arraylist to an array
       String[] fruits= arr.toArray(new String[0]);
       System.out.println("ArrayList to Array: "+Arrays.toString(fruits));

       // converting an array to arraylist
       arr=new ArrayList<>(Arrays.asList(fruits));
       
       System.out.println("Array to ArrayList: "+arr);

    }
}
