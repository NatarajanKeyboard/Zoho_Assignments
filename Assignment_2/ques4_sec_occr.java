import java.util.Scanner;
//import java.util.Arrays;

public class ques4_sec_occr {
    public static int secOccr(int target, int arr[])
    {
        int index = -1;
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == target)
            {   count++;
                if (count == 2)     //this determines the second occurence
                {
                    index = i;
                    break;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the aray size: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the element one by one...");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter target: ");
        int target = sc.nextInt();

        System.out.println("Second occurence of "+target+" is "+secOccr(target, a));

        sc.close();
    }
}
