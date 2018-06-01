
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
public class Rectangle { 




public static void main(String args[]) { 
Scanner in = new Scanner(System.in); 
    int m = in.nextInt(); 
    int n = in.nextInt(); 
     int Rect1[][] = new int[m][n]; 
      int Rect[][] = new int[m][n]; 
     int res = Rect[0][0]; 
        int max = res; 
       for (int i = 0; i < m; i++) { 
        int sum = 0; 
      for (int j = 0; j < n; j++) { 
        Rect[i][j] = in.nextInt(); 
         sum += Rect[i][j]; 
        if (i == 0) { 
       Rect[i][j] = sum; 
 } 
       Rect1[i][j] = sum; 
      if (i != 0) { 
          Rect[i][j]=Rect1[i][j]+Rect[i-1][j];
          max=Rect[i][j];
      }  
     if (res < max) { 
      res = max; 
} 
} 
} 
System.out.println(res); 
} 

}