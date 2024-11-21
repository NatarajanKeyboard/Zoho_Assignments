package ArrList;

import java.util.ArrayList;
import java.util.Arrays;

public class Search_Ques3 {//learned: indexOf() will also work here
    public static int indexOfElementInCharacters(char x)
    {
        ArrayList<Character> characters=new ArrayList<>(Arrays.asList('A','B','C','D','E','F','G','H','I','J'));
        for (char i : characters) {
            if(i==x)
            {
                return characters.indexOf(i);
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        
        System.out.println(indexOfElementInCharacters('J'));
        System.out.println(indexOfElementInCharacters('g'));
    }
}
