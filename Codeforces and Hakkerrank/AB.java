/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AB {
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int one = scn.nextInt();
		int two = scn.nextInt();
		List<Integer> ans = new ArrayList<Integer>();
		while(two > one)
		{
			ans.add(two);
			if(two % 2 == 0)
				two /= 2;
			else if(two%10 == 1)
				two /= 10;
			else
				break;
		}
		if(one == two)
		{
			System.out.println("YES");
			System.out.println(ans.size() + 1);
			System.out.print(one + " ");
			for(int i = ans.size()-1;i>=0;i--)
			{
				System.out.print(ans.get(i) + " ");
			}
		}else
		{
			System.out.println("NO");
		}
	}
}


