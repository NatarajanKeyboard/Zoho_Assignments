package Vectors;

import java.util.Arrays;
import java.util.Vector;

public class InsertAndRemove {
    public static void main(String[] args) {
        Vector<Character> characters = new Vector<>(Arrays.asList('A', 'B', 'C', 'D', 'E'));
        characters.set(2, 'X');
        System.out.println(characters);
        characters.remove(0);
        System.out.println(characters);

    }
}
