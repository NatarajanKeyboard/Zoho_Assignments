import java.util.Scanner;
public class ques2_grade {
    public static String grade500(int n)
    {
        if(450<n && n<=500)
        {
            return "A1";
        }
        else if(400<n)
        {
            return "A2";
        }
        else if(350<n )
        {
            return "B1";
        }
        else if(300<n )
        {
            return "B2";
        }
        else if(250<n)
        {
            return "C1";
        }
        else if(175<=n)
        {
            return "C2";
        }
        else
        {
            return "Fail";
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the score out of 500: ");
        int n=sc.nextInt();
        
        System.out.println("Grade: "+grade500(n));
        sc.close();
    }
}
