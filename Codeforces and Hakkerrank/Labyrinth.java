
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.lang.Integer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Labyrinth {
    static int i;
    static int j;
    public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    int ar[][] =new int[6][6];
    for(int i=0;i<6;i++)
        for(int j=0;j<6;j++)
            ar[i][j]=in.nextInt();
 
    DepthFirst dep =new  DepthFirst();
    System.out.println(dep);
    }
    
    
}
    
    
    
    
    
    
    
    
    
    
    
