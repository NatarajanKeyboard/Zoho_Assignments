package ArrList;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateAndRemove_Ques2 {
    public static void main(String[] args) {// to show the iterator and remove()
        ArrayList<Integer> numbers =new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println(numbers);
        Iterator itr=numbers.iterator();
        while (itr.hasNext()) {
            int e=(int)itr.next();
            if(e>30)
            {
                itr.remove();
            }            
        }
        System.out.println(numbers);
    }
    
}
