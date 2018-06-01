/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.util.Arrays;
import java.util.Scanner;
 
/** Class  LongestIncreasingSubsequence **/
public class  longestDecreasingSubsequence
{
public static void main(String args[]) { 
Scanner in = new Scanner(System.in); 
int size = in.nextInt(); 
int a[] = new int[size]; 
int b[] = new int[size]; 
for (int i = 0; i < size; i++) { 
          a[i] = in.nextInt(); 
           b[i] = 1; 
} 
    for (int i = 0; i < size; i++) { 
    for (int j = 0; j <= i - 1; j++) { 
   if(a[i]<a[j]){
       b[i]=Math.max(b[i],b[j]+1);
   }
    } 
     } 
Arrays.sort(b); 
System.out.println(b[b.length-1]); 
} 
}
   

