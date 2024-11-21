import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("**********Division*********\nEnter the numerator: ");
        int n=sc.nextInt();

        System.out.println("Enter the denominator: ");
        int d=sc.nextInt();
        int res;
        try{
         res=n/d;
         System.out.println("Result : "+res);
        }
        catch (ArithmeticException e) {
           System.out.println("check the denominator");
        }
        
    }
}