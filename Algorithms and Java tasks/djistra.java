
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
public class djistra {
   

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int src = in.nextInt();
        int n = in.nextInt();
        int[][] Graph = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Graph[i][j] = in.nextInt();

            }
        }
        int[] dist = new int[n];
        boolean[] isChange = new boolean[n];
        for (int i = 0; i < n; i++) {
            dist[i] = Integer.MAX_VALUE;
            isChange[i] = false;
        }
        dist[src] = 0;
        for (int i = 0; i < n - 1; i++) {
            int minDist = Integer.MAX_VALUE;
            int minInd = -1;
            for (int j = 0; j < n; j++) {
                if ((!(isChange[j])) && dist[j] <= minDist) {
                    minDist = dist[j];
                    minInd = j;
                }
            }
            isChange[minInd] = true;
            for (int j = 0; j < n; j++) {
                if (!isChange[j] && Graph[minInd][j] != 0 && dist[minInd] != Integer.MAX_VALUE && dist[minInd] + Graph[minInd][j] < dist[j]) {
                    dist[j] = dist[minInd] + Graph[minInd][j];
                }
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.println((src+1)+" -> "+(i+1)+" = "+dist[i]);
        }
    }
}

