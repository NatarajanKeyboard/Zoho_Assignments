package LinkdList;

import java.util.Arrays;
import java.util.LinkedList;


public class QueueBehaviourLl {// learnt removeFirst()
    public static void pop(LinkedList<String> ll)
    {
        ll.removeFirst();
    }
    public static void main(String[] args) {
        LinkedList<String> queue=new LinkedList<>(Arrays.asList("Alice", "Bob", "Charlie", "Diana"));

        pop(queue);pop(queue);
        System.out.println(queue);
    }
}
