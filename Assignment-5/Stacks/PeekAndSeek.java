package Stacks;

import java.util.Stack;
import java.util.Arrays;
public class PeekAndSeek {
    public static void main(String[] args) {
        // learnt position counts from top
        Stack<String> cardinalNumbers=new Stack<>();
        cardinalNumbers.addAll(Arrays.asList("first", "second", "third", "fourth"));
        System.out.println(cardinalNumbers.peek());
        System.out.println(cardinalNumbers.search("second"));           // 3  (position counts from top)
    }
}
