/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class contest31 {
    

/**
 * Created by 95112 on 11/4/2017.
 */

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] input = new int[n];
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(100,0);
        map.put(50,0);
        map.put(25,0);
        boolean ok = true;
        for (int i =0 ; i< n; i++)
        {

            input[i] = scanner.nextInt();
            if (ok){
                if (input[i] == 25){
                    int tims = map.get(25)+1;
                    map.put(25, tims);
                }
                else if (input[i] == 50){
                    int time = map.get(25);
                    if (time <= 0)
                    {
                        ok = false;
                        continue;
                    }
                    else {
                        map.put(25,time-1);
                        time = map.get(50);
                        time++;
                        map.put(50,time);
                    }
                }
                else {
                    int time25 = map.get(25);
                    int time50 = map.get(50);
                    if (time50>=1 && time25 >= 1){
                        map.put(25,time25-1);
                        map.put(50,time50-1);
                    }
                    else if (time25 >= 3){
                        map.put(25,time25 - 3);
                    }
                    else {
                        ok = false;
                    }
                }
            }
        }
        if (ok)
            System.out.println("YES");
        else
            System.out.println("NO");


    }
}

