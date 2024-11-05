package Assignment_4_AOPS;

import java.math.BigInteger;
import java.util.Scanner;

public class Grains {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the square number");
        int n=sc.nextInt();
        BigInteger num=BigInteger.valueOf(1);
        BigInteger sum=BigInteger.valueOf(0);

        for(int i=1;i<=64;i++)
        {
            num=num.multiply(BigInteger.valueOf(2));
            sum=num.add(num);
            if(i==n)
            {
                System.out.println("number of grains on "+i+" is: "+num);
            }
        }

        System.out.println("Total grains on the chessboard: "+sum);

        sc.close();
    }
}
