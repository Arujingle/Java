
import java.io.File;
import java.util.Scanner;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class EX20_11 {
    public static void main(String[] args){
       Stack<Character> s = new Stack<>();
       String s = "(ab(c[]a)d)";
       char [] ar = s.toCharArray();
       for(char c: ar){
           if(c=='[' || c=='('||c=='{'){
               st.push(c);
               
           }
           else if(c==']' && st.peek()=='[')
               if(st.peek()=='[')
           st.pop();        
       }
}
