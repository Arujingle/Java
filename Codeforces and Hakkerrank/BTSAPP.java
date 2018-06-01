
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class BTSAPP {
    public static void main(String[] args) throws IOException{
        int value;
        BTS b1 = new BTS();
        b1.insert(4);
        b1.insert(5);
        b1.insert(8);
        b1.insert(9);
        
        while(true){
            System.out.println("Enter the first letter to show:");
            System.out.println("Insert or find or display");
            int choice=getChar();
            
            switch(choice){case 'd': b1.printInorder(b1.getRoot());
            break;
            case 'i':
                System.out.println("Enter the value to insert:");
                value = getInt();
                b1.insert(value);
                break;
            case 'f':
                System.out.println("Enter the value to find:");
                value = getInt();
               Node found = b1.find(value);
               
               
            if(found!=null){System.out.println("Found:"+value);}
            else{System.out.println("The value did not find:"+value);
            
            break;
            
            
            
            
            }
            
            }
        }
        
        
       
        
        
        
    }
    
    
    public static String getString() throws IOException
{
      InputStreamReader isr = new InputStreamReader(System.in);
         BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
          return s;
    
    
}
    
     public static char getChar() throws IOException
{
String s = getString();
return s.charAt(0);
}
    
    public static int getInt() throws IOException{
String s = getString();
return Integer.parseInt(s);
}
    
    
    
    
}



