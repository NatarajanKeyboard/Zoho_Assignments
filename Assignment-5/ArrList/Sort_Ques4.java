package ArrList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sort_Ques4 {
    
    public static void main(String[] args) {//to show the importance of Collections.sort()

        ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(12,23,36,69,98,87,74,41,10,1));
        System.out.println("Before sorting:"+numbers);
        Collections.sort(numbers);
        System.out.println("After sorting: "+numbers);

    }
}
