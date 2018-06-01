
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.HashSet;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class EX19_03 {
    public class void main(String[] args){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
           al.add(2);
           al.add(5);
           System.out.println(al.toString());
           al=removeDuplicates(al);
           System.out.println(al.toString());
        
    }
    public static <E extends Comparable<E>> E max(E[] list){
        E max = list[0];
        for(E i:list){
            if(max.compareTo(i==-1)max=i);
            
        }
        return max;
    }
    
            
    
    
    
    
    
    
    public static <E> Arraylist<E> removeDuplicates(ArrayList<E> List){
        Set<E> set = new HashSet<E>();
        set.addAll(list);
        list.clear();
        list.addAll(set);
        return list;
    }
    
    
    
    
    
    
    
    
    
    }
