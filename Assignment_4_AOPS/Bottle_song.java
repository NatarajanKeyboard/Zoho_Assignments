package Assignment_4_AOPS;

import java.util.Scanner;

public class Bottle_song {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String[] cardinal_nums={"no","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
        for(int i=10;i>0;i--)
        {
            System.out.println(cardinal_nums[i]+" green bottles hanging on the wall,\n"+cardinal_nums[i]+" green bottles hanging on the wall,\nAnd if one green bottle should accidentally fall,\nThere'll be "+cardinal_nums[i-1].toLowerCase()+" green bottles hanging on the wall.\n\n");
        }

        
        sc.close();
    }
}
