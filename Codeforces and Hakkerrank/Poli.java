/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.util.*;
public class Poli{
	public static void main(String[] arg){
		Scanner in=new Scanner(System.in);
		ArrayList<String> list=new ArrayList<>();
		Stack<String> st=new Stack<>();
		String[] n=in.nextLine().split(" ");
		for(String i:n){
			if(!i.equals("+") && !i.equals("-") && !i.equals("*") && !i.equals("/")) list.add(i);
			else if(i.equals("+") || i.equals("-")){
				System.out.println("1");
				if(st.isEmpty() || (!st.peek().equals("*") && !st.peek().equals("/")))  st.push(i);
				else{list.add(st.pop());st.push(i);}
			}else if(st.isEmpty() || (!st.peek().equals("*") && !st.peek().equals("/"))) st.push(i);
			else{list.add(st.pop());st.push(i);}
		}
		for(int j=0;j<=st.size();j++) list.add(st.pop());
		System.out.println(list);
		System.out.println(st);
	}
}