
import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.Collections;
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
public class EX20_01 {
    public static void main(String[] args) throws FileNotFoundException {
        
        
        ArrayList<String> ar = new ArrayList<>();
        Scanner in = new Scanner(new File(args[0]));
        while(in.hasNext()){
            ar.add(in.next());
            }
        Collections.sort(ar);
        System.out.println(ar.toString());
        
        
        
        
        
        
    }
    
    
    
}
