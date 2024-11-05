package Assignment_4_AOPS;

import java.util.Scanner;

public class RNA_transcription {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the RNA strand:");
        String input=sc.next().toUpperCase();

        StringBuilder res=new StringBuilder();

        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)=='G')
            {
                res.append('C');
            }
            else if(input.charAt(i)=='C')
            {
                res.append('G');
            }
            else if(input.charAt(i)=='T')
            {
                res.append('A');
            }
            else if(input.charAt(i)=='A')
            {
                res.append('U');
            }
            else
            {
                res.append(input.charAt(i));
            }

        }

        System.out.println(res.toString());
        sc.close();
    }
}
