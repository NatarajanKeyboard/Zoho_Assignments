package Vectors;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Vector;

public class IterateAndModify {
    public static void main(String[] args) {// learnt asList(),Enumeration,elements(),hasMoreElements(),nextElement() in
                                            // vector

        Vector<String> fruits1 = new Vector<>(Arrays.asList("apple", "banana", "cherry", "date", "fig"));
        Vector<String> fruits2 = new Vector<>(Arrays.asList("cherry", "banana", "cherry", "cherry", "fig"));

        Enumeration enm = fruits1.elements(); // Iterator<String> itr=fruits1.iterator();
                                              // is also possible but in later versions
        while (enm.hasMoreElements()) {
            System.out.println(enm.nextElement()); // just printing
        }

        fruits1.set(fruits1.indexOf("cherry"), "coconut"); // method 1 (but replaces only first occurence)
        System.out.println(fruits1);

        enm = fruits2.elements(); // reassigning enumerator
        int index = 0;
        while (enm.hasMoreElements()) {
            String element = (String) enm.nextElement(); // or we can avoid explicit typecasting by
                                                         // "Enumeration<String>=fruits2.elements();"
            if (element.equals("cherry")) {
                fruits2.set(index, "coconut");
            }
            index++;    
        }
        System.out.println(fruits2);

    }
}
