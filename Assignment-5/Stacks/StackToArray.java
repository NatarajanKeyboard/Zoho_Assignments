package Stacks;
import java.util.Stack;
import java.util.Arrays;
public class StackToArray {
    public static void main(String[] args) {
        // Initialize the myStack with values 
        Stack<Double> myStack = new Stack<>(); 
        myStack.push(1.1); 
        myStack.push(2.2); 
        myStack.push(3.3); 
        myStack.push(4.4); 
        myStack.push(5.5);

        Double[] numbers=myStack.toArray(new Double[0]);// method 1
        

        Double[] numbers2 = new Double[myStack.size()];
         myStack.toArray(numbers2);                     // method 2

        for (Double double1 : numbers) {
            System.out.println(double1);        
        }

        // Create a new stack from the array 
        Stack<Double> newStack = new Stack<>();
        newStack.addAll(Arrays.asList(numbers));

        System.out.println(newStack);

    }
}
