package LinkdList;

import java.util.LinkedList;

public class LlOperations_Ques3 {
    public static void main(String[] args) {// learnt .remove(index), removeLast()
        LinkedList<Integer> numbers=new LinkedList<>();
        
        for(int i=1;i<11;i++)
        {
            numbers.add(i);
        }
        System.out.println(numbers);
        numbers.remove(2);
        numbers.removeLast();

        System.out.println("modified :"+numbers);
    }
}
