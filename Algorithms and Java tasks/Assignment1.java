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
public class Assignment1{
public static void main(String[] args){
       Scanner input=new Scanner(System.in);
       int n = input.nextInt();
       int[][] arr=new int[n][n];
       for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
        arr[i][j] = input.nextInt();
        }
         }

          int a=0;
          int b=0;

         for(int i=0;i<n;i++){
           a=0;
            b=0;
            for(int j=0;j<n;j++){

          b+=arr[i][j];
           a+=arr[j][i];

}



           System.out.print(b+a+" ");
        }


}
}