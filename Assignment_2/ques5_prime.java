import java.util.Scanner;

public class ques5_prime {
    public static void primeRange(long start,long end)              //can accept a very long range
    {
        for(long i=start;i<end;i++)
        {   if(i==1)continue;
            boolean flag=true;
            for(long j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                System.out.println(i);
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        
        primeRange(1, 30);

        sc.close();
    }
}
