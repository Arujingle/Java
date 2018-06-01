
import java.util.Scanner;
import java.lang.*;
import java.util.Arrays;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class zerocount {
    public static void main(String[] args){
     
        Scanner in = new Scanner(System.in);
      String number = in.nextLine();
    
     String [] a = number.split("1");
     int max =0;
    for(int i=0;i<a.length;i++){
      if(a[i].length()>max) max =a[i].length();
    }
    System.out.println(max);
  
    }
  
}
        
            
        
        
      
      
       
           
       
           
       
     

        
        
        
    

