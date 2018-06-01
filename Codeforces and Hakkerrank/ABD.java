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

public class ABD {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(), b = scan.nextInt();
		List<Integer> list = new ArrayList<>();
		while(b > a) {
			list.add(b);
			if(b%2 == 0) {
				b/=2;
			} else {
				if(b%10 == 1) {
					b/=10;
				} else {
					System.out.println("NO");
					return;
				}
			}
		}
		if(a != b) {
			System.out.println("NO");
			return;
		}
		list.add(a);
		System.out.println("YES\n" + list.size());
		for(int i = list.size()-1 ; i >= 0 ; i--)
			System.out.print(list.get(i) + " ");
	}
}
