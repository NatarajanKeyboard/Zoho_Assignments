import java.util.Scanner;
public class Acronyms {
    public static void method1(String s)
    {   String res=""+s.charAt(0);
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i-1)==' '|| s.charAt(i-1)=='-')
            {
                res+=s.charAt(i);
               
            }
        }
        System.out.println(res);
    }
    public static void method2(String s)
    {
        String[] str=s.split("[ -]");
        for(String c:str)
        {   
            System.err.print(c.charAt(0));
        }
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the full phrase:");
        String s=sc.nextLine();
        method1(s);
        method2(s);
        


        sc.close();
    }
}
