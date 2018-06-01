
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
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
public class RPN {
   static boolean isNumber(String str){
       try{
           Double.valueOf(str);
           return true;
       }catch(Exception e){
           return false;
           }
   } 
   Queue<String>convertInfixToRPN(String[] infixNotation){
       Map<String,Integer> p = new HashMap();
     p.put("/", 5);
     p.put("*",5);
     p.put("+",4);
     p.put("-",4);
     p.put("(",0);
     Queue<String> Q = new LinkedList<>();
     Stack<String> S = new Stack<>();
     for(String token: infixNotation){
         if("(".equals(token)){
             S.push(token);
             continue;
         }
         
         if(")".equals(token)){
             while(!"(".equals(S.peek())){
                 Q.add(S.pop());
             }
             S.pop();
             continue;
             
             }
            
         if(p.containsKey(token)){
             while(!S.empty() && p.get(token)<=p.get(S.peek())){
                 Q.add(S.pop());
             }
             S.push(token);
             continue;
             
             }
         if(isNumber(token)){
             Q.add(token);
             continue;
         
         }
         throw new IllegalArgumentException("Invalid input");
     }
     while(!S.isEmpty()){
         Q.add(S.pop());
         
     }
      return Q; 
       
   }
   public static void main(String[] args) {
        
 
        String[] infixNotation = {"2", "+", "4", "*", "5", "-", "6", "/", "2"};
         
        System.out.println(new RPN().convertInfixToRPN(infixNotation));
 
    }
   
   
}
