и т

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
public class QuickSort {
   public static int[] array ={10,60,50,40,20,30};
   public static void main(String[]args){

  
   Arrays.sort(array);
   doSort();
   System.out.println(Arrays.toString(array));
   }
    public static void doSort(){
        
    int start=0;
    int end= array.length-1; 
    }
   private static void doQuick(int start,int end){
       if(start>=end)return;
       int i=start;
       int j=end;
       int piv=i-(i-j)/2;
       
       while(i<j){
           
       while(i<piv &&(array[i] <=array[piv])){
           i++;
       }
    while(i>piv &&(array[piv]<=array[j])){
        j--;
    }
    if(i<j){
        int temp = array[i];
        array[i]=array[j];
        array[j]=temp;
        if(i==piv)
            piv=j;
        else if(j==piv)
            piv=i;   
    }
        
        
        
    }
   
       doQuick(start,piv);
       doQuick(piv+1,end);
       
       
       
       
}
}