
import static java.nio.file.Files.size;
import java.util.Iterator;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class EX20_06 {
    public static void main(String[] args){
        LinkedList<Integer> list= new LinkedList<>();
        int size = 100000;
        for(int i=0; i<size;i++){
            list.add(i);
        }
        Long time1 = System.currentTimeMillis();
        for(int i=0;i<size;i++){
            list.get(i);
        }
        Long time2 = System.currentTimeMillis();
        System.out.println("With get:"+(time2-time1));
        Iterator<Integer> iter = list.iterator();
        while(iter.hasNext()){
            iter.next();
        }
        Long time4=System.currentTimeMillis();
        System.out.println("With iterator:"+(time4-time1));
        
        
    }
}
