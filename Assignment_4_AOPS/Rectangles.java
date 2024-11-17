package Assignment_4_AOPS;
public class Rectangles {
    public static void main(String[] args) {
        System.out.println("*****Rectangless*****");

        char rectangles[][] = {{ ' ', ' ', ' ', '+', '-', '-', '+' },
                                { ' ', ' ', '+', '+', ' ', ' ', '|' },
                                { '+', '-', '+', '+', '-', '-', '+' },
                                { '|', ' ', ' ', '|', ' ', ' ', '|' },
                                { '+', '-', '-', '+', '-', '-', '+' }
                                };

        char rectangles1[][] = {{ '+', '-', '-', '+', '-', '-', '+' },
                                { '|', ' ', ' ', '+', ' ', ' ', '|' },
                                { '+', '-', '+', '+', '-', '-', '+' },
                                { '|', ' ', ' ', '|', ' ', ' ', '|' },
                                { '+', '-', '-', '+', '-', '-', '+' }
                               };
        char rectangles2[][] = { { '+', '-', ' ', '-', '-', '-', '+' },
                                { '|', ' ', ' ', '|', ' ', ' ', '|' },
                                { '+', '-', '-', '+', ' ', ' ', '|' },
                                { '|', ' ', ' ', '|', ' ', ' ', '|' },
                                { '+', '-', '-', '+', '-', '-', '+' }
                              };

        int rectanglesCount = 0;

        // Showing the board
        for (int i = 0; i < rectangles.length; i++) {
            for (int j = 0; j < rectangles[1].length; j++) {
                System.out.print(rectangles[i][j]);
            }
            System.out.println();
        }

        first: for (int i = 0; i < rectangles.length; i++) {
            second: for (int j = 0; j < rectangles[i].length; j++) {
                if (rectangles[i][j] == '+') {
                    third: for (int k = j + 1; k < rectangles[i].length; k++) {
                        if (rectangles[i][k] != ' ') {
                            if (rectangles[i][k] == '+') {
                                fourth: for (int l = i + 1; l < rectangles.length; l++) {
                                    if (rectangles[l][k] != ' ' && rectangles[l][j] != ' ') {
                                        if (rectangles[l][j] == '+' && rectangles[l][k] == '+') {
                                            fifth:for(int m=j+1;m<=k;m++)
                                            {
                                                if(rectangles[l][m]==' ')break third;
                                            }
                                            rectanglesCount++;
                                        }
                                    } else
                                        break third;
                                }
                            }
                        } else
                            break third;
                    }
                }
            }

        }
        System.out.println("Number of rectangles: " + rectanglesCount);
    }
}
