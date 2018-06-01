
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
public class Contest1 {
    public static void main(String[] args){
        int m=0;
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = a.toLowerCase();
        String b1="hello";
        for(int i=0;i<a.length();i++){
            if(b.charAt(i)== b1.charAt(m) && m<5){
                m++;
            if(m==5) break;}
        }
                if(m==5){
                    System.out.println("YES");
                    
                }
                else{
                    System.out.println("NO");
                }
            }
                
                
        }
        
    
    
    
    
        
