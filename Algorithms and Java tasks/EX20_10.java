
import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class EX20_10 {
    public static void main(String[] args){
        PriorityQueue<String> a = new PriorityQueue<>(Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Michael"));
        PriorityQueue<String> b = new PriorityQueue<>(Arrays.asList("George", "Katie", "Kevin", "Michelle", "Ryan"));
        Set<String> union = new HashSet<String>(a);
        union.addAll(b);
        System.out.println("Union:"+union.toString());
        union.removeAll(b);
        System.out.println("Diff:"+union.toString());
        a.retainAll(b);
        System.out.println("intersection:"+a.toString());
        
        
        
        
        }
    }

