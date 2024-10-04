import java.util.Scanner;
public class ques3_multi {
    Scanner sc=new Scanner(System.in);
    public static void multi(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i+" x "+n+"= "+i*n);
        }
    }
    public static void main(String[] args) {
        
        System.out.println("*******Multiplication table*******\nEnter the numer: ");

        int n=new ques3_multi().sc.nextInt();
        
        multi(n);
    }
}
