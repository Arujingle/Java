
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Assignment22 {
   





    // TODO Auto-generated method stub
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] MatrixVeight = new int[n + 1][n + 1];
        int[][] MatrixHistory = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                MatrixVeight[i][j] = in.nextInt();
                if (MatrixVeight[i][j] != 0) {
                    MatrixHistory[i][j] = j;
                } else {
                    MatrixVeight[i][j] = 2000;
                }
            }
        }

        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (MatrixVeight[i][j] > MatrixVeight[i][k] + MatrixVeight[k][j]) {
                        MatrixVeight[i][j] = MatrixVeight[i][k] + MatrixVeight[k][j];
                        MatrixHistory[i][j] = k;
                    }

                }

            }
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf(MatrixVeight[i][j] + " ");
            }
            System.out.println();
        }

        int x = 1;
        System.out.println(1);
        while (x != n) {
            x = MatrixHistory[x][n];
            if (x == MatrixHistory[x][n]) {
                continue;
            } else {
                System.out.println(x);
            }
        }

    }
}
/*
5
0 2 0 0 8
2 0 1 0 7 
0 1 0 0 1
0 0 0 0 2
7 3 4 2 0
*/
}
