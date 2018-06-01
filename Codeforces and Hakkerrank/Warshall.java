/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */

    import java.util.Scanner;


public class Warshall {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr1 = new int[n + 1][n + 1];
        int[][] arr2 = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                arr1[i][j] = in.nextInt();
                if (arr1[i][j] != 0) {
                    arr2[i][j] = j;
                } else {
                    arr1[i][j] = 1000000;
                }
            }
        }

        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (arr1[i][j] > arr1[i][k] + arr1[k][j]) {
                        arr1[i][j] = arr1[i][k] + arr1[k][j];
                        arr2[i][j] = k;
                    }
                }
            }
        }
        System.out.println();

        /*for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf(arr1[i][j] + " ");}
            System.out.println();}*/
        System.out.println("new matrix");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf(arr2[i][j] + " ");
            }
            System.out.println();
        }

        int x = 1;

        System.out.println(1);
        System.out.println(arr2[1][1]);
        while (x != n) {
            x = arr2[x][n];
            if (x == arr2[1][1]) {
                continue;
            } else {
                System.out.println(x);
            }
        }
    }
}

