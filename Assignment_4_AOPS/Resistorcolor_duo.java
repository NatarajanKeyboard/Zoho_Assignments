package Assignment_4_AOPS;


import java.util.Scanner;

public class Resistorcolor_duo {
     public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String[] g=sc.next().split("-");
        System.out.println(Resistorcolor.my.get(g[0])+""+Resistorcolor.my.get(g[1]));

        sc.close();
    }
}
