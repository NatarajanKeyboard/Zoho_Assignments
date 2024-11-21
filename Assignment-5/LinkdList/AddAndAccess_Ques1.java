package LinkdList;


import java.util.LinkedList;

public class AddAndAccess_Ques1 {//to show the importance of getFirst() and getLast()

    public static void main(String[] args) {
        LinkedList<Integer> numbers=new LinkedList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        System.out.println(numbers+"\nFirst element:"+numbers.getFirst()+"\nLast element :"+numbers.getLast());
        
    }
}