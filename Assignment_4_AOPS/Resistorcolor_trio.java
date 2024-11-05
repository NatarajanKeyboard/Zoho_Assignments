package Assignment_4_AOPS;

import java.util.Scanner;

public class Resistorcolor_trio {
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        String[] g=sc.next().split("-");


        int first_two_rings= Resistorcolor.my.get(g[0])*10 + Resistorcolor.my.get(g[1]);

        int z=(int)Math.pow(10,Resistorcolor.my.get(g[2]));
        int third_ring=z/100000;
        String  suffix="";
        if(third_ring==0)
        {
            third_ring=z/1000;
            if(third_ring==0)
            {
                suffix=" Ohms"; 
               third_ring=z;
            }
            else
            {
                suffix=" KiloOhms";
            }

        }
        else{
            suffix=" MegaOhms";
        }
        System.out.println(first_two_rings*third_ring+""+suffix);
        

        sc.close();
    }
}
