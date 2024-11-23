package Stacks;

import java.util.Stack;
import java.util.Arrays;
public class BasicStackOperations {
    public static void main(String[] args) {

        /* Stack<Integer> numberStack=new Stack<>(Arrays.asList(1,2,3,4,5));
                    // is not possible here in stack
                    
        Stack<Integer> numberStack1= new Stack<>();
        numberStack.addAll(Arrays.asList(1, 2, 3, 4, 5));
                    // this is only possible here,(adding all elements at one strech) 
        */
        Stack<Integer> numberStack=new Stack<>();   
        numberStack.push(10);
        numberStack.push(20);
        numberStack.push(30);
        numberStack.push(40);
        numberStack.push(50);

        System.out.println(numberStack);
        System.out.println("popping : "+numberStack.pop());
        System.out.println(numberStack);
    }
}
