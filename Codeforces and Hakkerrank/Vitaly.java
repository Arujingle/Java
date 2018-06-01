/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
 import java.util.Scanner;
public class Vitaly {
   	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), ans = 0, keys[] = new int[26];
		char t[] = in.next().toCharArray();
		for(int i = 0; i < t.length; i += 2)
		{
			keys[t[i]-'a']++;
			if(keys[t[i+1]-'A'] == 0)
				ans++;
			else
				keys[t[i+1]-'A']--;
		}
		System.out.println(ans);
	}
}

