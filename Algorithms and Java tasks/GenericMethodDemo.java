/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class GenericMethodDemo {
    public static void main(String[]args){
        Integer[] integers = {1,2,3,4,5};
        String[] strings  = {"Aru","Aray","Talshin"};
        GenericMethodDemo.<Integer>print(integers);
        GenericMethodDemo.<String>print(strings);
        
        }
        public static <E> void print(E[] list){
            for(int i=0;i<list.length;i++)
            System.out.println(list[i]+"");
            System.out.println();
        
        
    }
    }
    
