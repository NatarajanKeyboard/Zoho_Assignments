package ArrList;

import java.util.ArrayList;

public class AddAndRetrieve_Ques1 {

    public static void main(String[] args) {// learnt add()

        ArrayList<String> fruits = new ArrayList<>();
        // Adding 5 different fruits to the list
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Jack");
        fruits.add("Orange");
        fruits.add("Rambuttan");


        // printing the third element (which is 2nd index)
        System.out.println(fruits.get(2));
        System.out.println(fruits);
    }

}
