package Stacks;

import java.util.Stack;

public class BalancedParanthesis {
    public static void isBalanced(String s)
    {
        Stack<Character> myStack=new Stack<>();
        for (char c : s.toCharArray()) {
            if (c=='(') {
                myStack.push(c);
                
            }
            if (c==')') {
                myStack.pop();
            }
        }



        if(myStack.isEmpty())
        {
            System.out.println("Balanced");
        }
        else{
            System.out.println("not balanced");
        }
    }
    public static void main(String[] args) {
        String para1="(())";
        String para2="(()";
        String para3="(()(()))";

        isBalanced(para1);
        isBalanced(para2);
        isBalanced(para3);
        


    }
}
