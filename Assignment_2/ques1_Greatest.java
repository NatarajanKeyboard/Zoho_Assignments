import java.util.Scanner;
public class ques1_Greatest {
    public static int greatest(int a,int b,int c) {
        return (a>b && a>c)?a:(b>a && b>c?b:c);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers...");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        System.out.println("Greatest number is:"+greatest(a,b,c));

        sc.close();
    }
    
}