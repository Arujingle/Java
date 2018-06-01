

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
public class EX20_21 {
    public static void main(String[] args){
        GeometricObject[] list = {
            new Circle(5),new Rectangle(4,5),
            new Circle(5,5),new Rectangle(2.4,5),
            new Circle(0.5),new Rectangle(4,65),
            new Circle(4.5),new Rectangle(4.4,1),
            new Circle(6.5),new Rectangle(4,5)
        };
        System.out.println("Bofore sort:");
        for(GeometricObject o:list){
            System.out.println(o.getArea());
        }
        
        selectionSort(list,new Comparator<GeometricObject>(){
            public int compare(GeometricObject o1, GeometricObject o2){
                double a1=o1.getArea();
                double a2=o2.getArea();
                if(a1>a2)
                    return 1;
                if(a1==a2)
                    return 0;
                else 
                    return -1;
            }
        });
        System.out.println("After sort: ");
        for(GeometricObject o:list){
            System.out.println(o.getArea());
        }
        
    }
    
    public static<E> void selectionSort(E[]array,Comparator<? super E> comparator){
        for(int i=0;i<array.length-1;i++){
            E currentMin=array[i];
            int minIndex = i;
            for(int k=i+1;k<array.length;k++){
                if(comparator.compare(array[k],currentMin)<0){
                        currentMin = array[k];
                minIndex = k;
            }
           if (minIndex!=i){
                array[minIndex]=array[i];
                array[i]=currentMin;
            } 
                
                
                
        }
        
        
        
    }
}
}
