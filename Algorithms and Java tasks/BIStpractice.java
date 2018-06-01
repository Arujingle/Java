/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */  
import java.io.*;
public class BIStpractice {
    public static  void main(String[] args)throws Exception{
        File file = new File("temp.dat");
    try(
            FileOutputStream output = new FileOutputStream(file);){
        for(int i=0;i<=10;i++)
            output.write(i);
    }
            try(
                    FileInputStream input=new FileInputStream(file);){
                int value;
                while((value=input.read())!=-1)
                    System.out.println(value+"");
            }
        
            
}
    }
 