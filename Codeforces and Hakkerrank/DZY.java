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
import java.util.Map;
import java.util.HashMap;

public class DZY {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Map<Integer, Integer> hash = new HashMap<>();
    int p = sc.nextInt(), n = sc.nextInt();
    int[] x = new int[n];

    for (int i = 0; i < n; ++i) {
      x[i] = sc.nextInt();
    }

    sc.close();

    for (int i = 0; i < n; ++i) {
      int key = x[i] % p;

      if ( ! hash.containsKey(key)) {
        hash.put(key, 1);
      } else {
        System.out.println(i + 1);
        return;
      }
    }

    System.out.println(-1);
  }
}
