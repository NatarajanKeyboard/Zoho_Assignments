package Vectors;

import java.util.Arrays;
import java.util.Vector;

public class ConversionVectrAndArr {
    public static void main(String[] args) { // learnt Arrays.toString(), vector.toArray(new String[0]);
        Vector<String> str=new Vector<>();
        str.add("red");
        str.add("green");
        str.add("blue");
        str.add("yellow");
        


        String[] oruArray=str.toArray(new String[0]);//vector to arrays
       
        System.out.println("Array : "+Arrays.toString(oruArray));
        str=new Vector<>(Arrays.asList(oruArray));
        System.out.println("vector : "+str);


    }
}
