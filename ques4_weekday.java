import java.util.Scanner;
enum weekday
{
Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
}

public class ques4_weekday {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the day number");
        int n=sc.nextInt();
        weekday s;
        switch (n)
        {
            case 1:
                s=weekday.Sunday;
                System.out.println("This is "+s);
                break;

            case 2:
                s=weekday.Monday;
                System.out.println("This is "+s);
                break;

            case 3:
                s=weekday.Tuesday;
                System.out.println("This is "+s);
                break;

            case 4:
                s=weekday.Wednesday;
                System.out.println("This is "+s);
                break;

            case 5:
                s=weekday.Thursday;
                System.out.println("This is "+s);
                break;

            case 6:
                s=weekday.Friday;
                System.out.println("This is "+s);
                break;

            case 7:
                s=weekday.Saturday;
                System.out.println("This is "+s);
                break;
            
            default:
                System.out.println("Enter the correct week number");
                break;
        }

        sc.close();
    }
    
}
