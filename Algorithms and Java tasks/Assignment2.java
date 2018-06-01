/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.*;
        public class Assignment2{
       static ArrayList<String> list = new ArrayList<>();
     static ArrayList<Integer> list1 = new ArrayList<>();
       public static void main(String[] args){
   int[][] map={
         {0,2,0,0,7},
         {2,0,1,0,3},
         {0,1,0,0,2},
         {0,0,0,0,2},
         {7,3,2,2,0}
};
       rec(map,0,0,"");

         int index = list1.indexOf(Collections.min(list1));
          System.out.println(list.get(index)+" = "+list1.get(index));
          System.out.println(list1);
          System.out.println(list);
}
           static void rec(int[][] m,int a,int c,String s){
               
      for(int i=a+1;i<m.length;i++){
          if(m[a][i]!=0){
              rec(m,i,m[a][i]+c,s+i+" ");
           
            if(i==m.length-1){
                s+=a+1;
                c+=m[a][i];
             list.add("\""+ s+" 5"+"\"");
             list1.add(c);
}
}
}

}
}
