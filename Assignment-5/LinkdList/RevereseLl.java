package LinkdList;

import java.util.LinkedList;
import java.util.Arrays;
import java.util.Collections;
public class RevereseLl { // learnt the importance of Collections.reverse()
    public static void reverseLl(LinkedList<Character> c)
    {   
        Collections.reverse(c);
    }
    public static void main(String[] args) {
        LinkedList<Character> chars=new LinkedList<>(Arrays.asList('A', 'B', 'C', 'D', 'E'));
        System.out.println("before reversing "+chars);
        reverseLl(chars);
        System.out.println("after reversing "+chars);

    }
}
