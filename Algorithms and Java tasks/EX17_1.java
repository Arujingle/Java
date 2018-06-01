
import java.io.File;
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class EX17_1 {
    public static void main(String[] args)throws Exception {
        PrintWriter out = new PrintWriter(new File("exl.txt"));
        for(int i =0; i<100;++i){
            out.write((int)(Math.random()*100)+" ");
            
        }
        out.close();
        
    }
    
}
