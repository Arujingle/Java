
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
public class Polygon {
    public static void main(String[] args){
       
    Scanner in = new Scanner(System.in);
   System.out.println("Enter the polygons X1 edges:");
   int x1=in.nextInt();
    System.out.println("Y1:");
    int Y1=in.nextInt();
     System.out.println("X2:");
   int x2=in.nextInt();
    System.out.println("Y2:");
    int Y2=in.nextInt();
    System.out.println("X3:");
     int x3=in.nextInt();
     System.out.println("Y3:");
    int Y3=in.nextInt();
    System.out.println("x4:");
     int x4=in.nextInt();
     System.out.println("Y4:");
    int Y4=in.nextInt();
    System.out.println("X5:");
     int x5=in.nextInt();
     System.out.println("Y5:");
    int Y5=in.nextInt();
    System.out.println("X6:");
     int x6=in.nextInt();
     System.out.println("Y6:");
    int Y6=in.nextInt();
    int total = ((x1*Y2-x2*Y1)+(x2*Y3-x2*Y3)+(x3*Y4+x4*Y3)+(x4*Y5+x5*Y4)+(x5*Y6+x6*Y5));
    double Area1=Math.abs(total*0.5);
    System.out.println("The first method: "+Area1);
    
     
}
}
