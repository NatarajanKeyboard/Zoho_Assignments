package Vectors;

import java.util.Vector;

public class BasicVectorOperations {
    public static void main(String[] args) {
        Vector<Integer> numbers=new Vector<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println(numbers.get(2));
        System.out.println(numbers);
    }
}
