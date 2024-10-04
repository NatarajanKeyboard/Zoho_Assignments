import java.util.Scanner;
public class ques6_sum_even {
    public static int sumOfEvenElements(int[] arr)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)                             
            {
                continue;
            }
            count+=arr[i];
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();

        int[] a=new int[n];

        System.out.println("Enter the array elements one by one...");
        for( int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(sumOfEvenElements(a));


        sc.close();
    }
}
