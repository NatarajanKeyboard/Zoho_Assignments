import java.util.Scanner;

public class DungeonRider {

    public static int calculateMinSteps(int a_pos_x, int a_pos_y,int g_pos_x,int g_pos_y )
    {

        return Math.abs(a_pos_x-g_pos_x)+Math.abs(a_pos_y-g_pos_y);
    }

    public static void showDungeonBoard(String[][] dungeon,int row,int col)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(dungeon[i][j]+" ");
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //getting dungeon details
        System.out.println("Dimensions of the dungeon:");
        int row=sc.nextInt();
        int col=sc.nextInt();


        //creating dungeon ground
        String dungeon[][]=new String[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                dungeon[i][j]="_";
            }
            
        }

        //getting adventurer's location
        System.out.println("Position of adventurer:");
        int a_pos_x=sc.nextInt();
        int a_pos_y=sc.nextInt();


        //getting monster's location
        System.out.println("Position of monster:");
        int m_pos_x=sc.nextInt();
        int m_pos_y=sc.nextInt();

        
        //getting gold's location
        System.out.println("Position of gold:");
        int g_pos_x=sc.nextInt();
        int g_pos_y=sc.nextInt();


        dungeon[a_pos_x-1][a_pos_y-1]="A";
        dungeon[g_pos_x-1][g_pos_y-1]="G";

        

        System.out.println("Minimum number of steps : "+ calculateMinSteps(a_pos_x,a_pos_y,g_pos_x,g_pos_y));

        showDungeonBoard(dungeon,row,col);



        sc.close();
    }
    
}