import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneNumberException {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Phone number: ");
        try {
            long phoneNumber=sc.nextLong();
            if(phoneNumber<1000000000l || phoneNumber>9999999999l)
            {
                throw new InputMismatchException();
            }
            System.out.println("calling "+phoneNumber+" ...");
        } catch (InputMismatchException e) {
            System.out.println("Enter the 10 digit phone number");
            main(new String[]{});
        }
    }
    
}
