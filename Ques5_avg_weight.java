import java.util.Scanner;
public class Ques5_avg_weight
{
    public static void main(String[] args) {
        float[] weights=new float[10];
        System.out.println("Enter the weights of all ten members");
        Scanner sc=new Scanner(System.in);
        float sum=0;
        for(int w=0;w<weights.length;w++)
        {
            weights[w]=sc.nextFloat();
            sum+=weights[w];
        }
        float average=sum/10;
        System.out.println("The average weights of 10 students is "+average+" kgs");

        sc.close();
        }
}