import java.util.InputMismatchException;
import java.util.Scanner;

class NegativeNumberException extends Exception
{
    NegativeNumberException()
    {
        System.out.println("Please enter a positive value !");
    }
}

public class CustomExceptionsMain 
{
    static int count=0;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount to send to Mr.Natarajan.K :");
        int amount=0;
        try {
             amount=sc.nextInt();
            if(amount<0)
            {
                throw new NegativeNumberException();
            }
            else
            {
                System.out.println("Sending Rs."+amount+" to Mr. Natarajan.K...\ncompleted");


            }
            
        } catch (NegativeNumberException e) {
            System.out.println("catched here\n...have another try");
            main(new String[]{});
        }
        catch(InputMismatchException e)
        {
            System.out.println("Type only the numbers...");
            main(new String[]{});
        }
        finally
        {
            count++;
            System.out.println("(number of attempts tried: "+count+")"+amount);
        }
        sc.close();
    }

}