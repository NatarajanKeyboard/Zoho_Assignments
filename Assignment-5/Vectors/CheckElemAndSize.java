package Vectors;

import java.util.Vector;

public class CheckElemAndSize {
    public static void main(String[] args) { // learnt .capacity(), .contains()
        Vector<Double> doubleNumbers=new Vector<>();
        doubleNumbers.add(1.0);
        doubleNumbers.add(45.334);
        doubleNumbers.add(10.5);
        doubleNumbers.add(234.31);
        doubleNumbers.add(4413.90876543245);

        System.out.println(doubleNumbers);
        System.out.println(doubleNumbers.contains(10.5));
        System.out.println(doubleNumbers.contains(3.45));

        System.out.println("Before adding : "+doubleNumbers.capacity());
        System.out.println(doubleNumbers.size());
        doubleNumbers.add(324243.452);

        // doubleNumbers.add(324243.452);doubleNumbers.add(324243.452);doubleNumbers.add(324243.452);doubleNumbers.add(324243.452);doubleNumbers.add(324243.452);doubleNumbers.add(324243.452);
        // doubleNumbers.add(324243.452);doubleNumbers.add(324243.452);doubleNumbers.add(324243.452);doubleNumbers.add(324243.452);doubleNumbers.add(324243.452);doubleNumbers.add(324243.452);doubleNumbers.add(324243.452);doubleNumbers.add(324243.452);doubleNumbers.add(324243.452);

        // vector, eppo full aagutho, appothaan vector size double aah increase aagum.

        System.out.println("After adding : "+doubleNumbers.capacity());
        System.out.println(doubleNumbers.size());
    }
}
