/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
  import java.util.Scanner ;
/**
 *
 * @author Admin
 */
public class Sound {
   
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in); 
		int n=input.nextInt();
		input.nextLine();
		int result=0,count=0;
		String k=input.nextLine();
		for(int i=0;i<n;i++){
			if(k.charAt(i)==' '){
				result=Math.max(count, result);
				count=0;
			}
			if(k.charAt(i)>='A' && k.charAt(i)<='Z')
                            count++; 
		}
		System.out.println(Math.max(result, count));
	}
}

