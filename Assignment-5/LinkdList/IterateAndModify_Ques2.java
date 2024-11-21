package LinkdList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class IterateAndModify_Ques2 {// to show the importance of previous()
    public static void main(String[] args) {
        LinkedList<String> cardinalNumbers = new LinkedList<>(Arrays.asList("one", "two", "three", "four", "five"));
        ListIterator litr=cardinalNumbers.listIterator();
        while(litr.hasNext())
        {
            if(litr.next().equals("three"))
            {
                cardinalNumbers.set(cardinalNumbers.indexOf(litr.previous()),"THREE");//previous() is used here
            }
        }
        System.out.println("modified: "+cardinalNumbers);
    }
}
