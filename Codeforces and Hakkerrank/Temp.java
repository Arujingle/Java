
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Temp {
    public static void main(String[]args)throws Exception{
        File file = new File("a.dat");
        /*FileOutputStream out = new FileOutputStream(file);
        for(int i =1;i<10;i++)
            out.write(i);
        FileInputStream in = new FileInputStream(file);
        int value;
        while((value=in.read())!=-1)
            System.out.print(value + " ");
        */
       ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
       out.writeUTF("asd");
       out.writeObject(new Date());
       out.close();
       ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
       String s = in.readUTF();
       Date d = (Date)in.readObject();
       System.out.println(s+" "+d);
       
       
       
       
       }
       
       
    }
    

