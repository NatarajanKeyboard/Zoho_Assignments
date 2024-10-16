import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String ip = sc.nextLine().toLowerCase();
        
        String check = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < ip.length(); i++) 
        {
            if (check.contains("" + ip.charAt(i))) 
            {
                check=check.replace(""+ip.charAt(i),"");
            }
        }

       if(check.length()==0)
       {
            System.out.println("The given sentence is a valid Pangram");
       }
       else
       {
            System.out.println("The given sentence is not a valid Pangram");
       }
        
        sc.close();
    }
}
