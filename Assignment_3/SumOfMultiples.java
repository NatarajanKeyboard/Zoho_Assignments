import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
public class SumOfMultiples {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the level number:");
        int level_num=sc.nextInt();
        System.out.println("Enter the base value 1:");
        int base_1=sc.nextInt();
        System.out.println("Enter the base value2:");
        int base_2=sc.nextInt();


        Set<Integer> my_set=new HashSet<>();
        int count=0;
        for(int i=base_1;i<level_num;i+=base_1)
        {
            my_set.add(i);
        }
        for(int j=base_2;j<level_num;j+=base_2)
        {
            my_set.add(j);
        }
        for(int a:my_set)
        {
        count+=a;
        }
        // System.out.println(my_set);
        System.out.println(count);
        sc.close();
    }
}