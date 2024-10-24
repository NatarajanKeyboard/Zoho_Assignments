import java.util.Scanner;

public class Tictactoe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to tic tac toe:");
        System.out.println("Enter \".\" for spaces, \"x\" for x-turn,\"o\" for o-turn");

        String[][] tic = new String[3][3];
        int count_x = 0, count_o = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tic[i][j] = sc.next();
                if (tic[i][j].equals("x")) {
                    count_x++;
                }
                if (tic[i][j].equals("o")) {
                    count_o++;
                }

            }
        }
        // System.out.println(count_x + " " + count_o);

        boolean flag = true;
        if (count_x < count_o) {
            System.out.println("Invalid: wrong turn ");         //checking for invalid 
            flag=false;
        }
        boolean count_less = false;
        if (count_x < 5) {
            count_less = true;
        }

        if (count_x >= 3) {

            for (int i = 0; i < 3; i++) {

                if ((tic[i][0].equals("x") && tic[i][1].equals("x") && tic[i][2].equals("x"))
                        || (tic[0][i].equals("x") && tic[1][i].equals("x") && tic[2][i].equals("x"))) {

                    if (count_x != count_o) {
                        System.out.println("X wins");           //prints only if it is in correct order
                    } // wins horizontally or vertically
                    else {
                        System.out.println("Invalid: Continued playing after win");
                    }
                    flag = false;
                    break;

                }

            }
            if (flag && ((tic[0][0].equals("x") && tic[1][1].equals("x") && tic[2][2].equals("x"))
                    || (tic[0][2].equals("x") && tic[1][1].equals("x") && tic[2][0].equals("x")))) {
                System.out.println("X wins"); // wins diagonally
                flag = false;

            }

            if (flag) {

                for (int i = 0; i < 3; i++) {

                    if ((tic[i][0].equals("o") && tic[i][1].equals("o") && tic[i][2].equals("o"))
                            || (tic[0][i].equals("o") && tic[1][i].equals("o") && tic[2][i].equals("o"))) {
                        System.out.println("O wins"); // wins horizontally or vertically
                        flag = false;
                        break;

                    }

                }
                if (flag && ((tic[0][0].equals("o") && tic[1][1].equals("o") && tic[2][2].equals("o"))
                        || (tic[0][2].equals("o") && tic[1][1].equals("o") && tic[2][0].equals("o")))) {
                    if (flag) {
                        System.out.println("Continued playing after win");
                    }
                    System.out.println("O wins"); // wins diagonally
                    flag = false;

                }
                if (flag && count_x == 5) {
                    System.out.println("Draw");             //draws only if  all the tiles are filled and no x,o wins previously
                    flag = false;
                }

            }
        }

        if (flag && count_less) {
            System.out.println("ongoing");          //if it has many dots and no wins as of now
        }

        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 3; j++) {
        // System.out.print(tic[i][j] + " ");
        // }
        // System.out.println();
        // }

        sc.close();
    }
}
