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

public class contest04_E {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] h = new int[n];
		for (int i = 0; i < n; ++i)
			h[i] = in.nextInt();
		int ans = 0;
		for (int i = 0; i < n; ++i) {
			int pos = i - 1, tot = 1;
			while (pos >= 0 && h[pos] <= h[pos + 1]) {
				tot ++;
				pos --;
                        }
			pos = i + 1;
			while (pos < n && h[pos] <= h[pos - 1]) {
				tot ++;
				pos ++;
			}
			ans = Math.max(ans, tot);
		}
		System.out.println(ans);
	}
};