package Stacks;

import java.util.Stack;

public class ReverseAString {
    public static void main(String[] args) {// learnt isEmpty and concurrent modification
        String str="hello";
        Stack<Character> myStack=new Stack<>();

        for (char c : str.toCharArray()) {
            myStack.push(c);
        }
        str="";
        // for (Character o : myStack) {
        //     str+=myStack.pop();
        // }
        // System.out.println(str);     ConcurrentModificationException

        while (!myStack.isEmpty()) {
            str+=myStack.pop();
        }
        System.out.println(str);
    }
}
