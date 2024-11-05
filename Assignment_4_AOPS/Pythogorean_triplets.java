package Assignment_4_AOPS;

import java.util.Scanner;

public class Pythogorean_triplets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();     //n=1000 and n=10000  will give results!
        for(int a=1;a<n/2;a++)
        {
            for(int b=a+1;b<n/2;b++)
            {
                for(int c=b+1;c<n/2;c++)
                {
                    if((a<b && b<c)&&(a*a +b*b==c*c)&&(a+b+c==n))
                    {
                        System.out.println("a: "+a+" b: "+b+" c: "+c);
                    }
                }
            }

        }


        sc.close();
    }
}
