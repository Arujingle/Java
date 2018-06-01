
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


public class Play {
    public static void main(String args[]){
       Scanner in = new Scanner(System.in);
      long sum =in.nextLong();
       long mult=in.nextLong();
       
       for(long i=0;i<sum;i++){
           for(long j=0;j<mult;j++){
               if((i+j)==sum && (i*j) == mult)
                   System.out.println("X is"+i+" and Y is"+j);
           }
       }
    }
}
