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
    public class brow{
        public static void main(String[] args){
        int n,pos,m,r;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        pos = sc.nextInt();
        m = sc.nextInt();
        r = sc.nextInt();
        int res = 0;
            if(m==1&&r==n)
                System.out.println(res);
        else {
            if(m==1){
            
                res+=Math.abs(r-pos)+1;
        }
        else if(r==n){
            res = Math.abs(pos-m)+1;
        }
        else{
        int dis = Math.min(Math.abs(pos-m),Math.abs( r-pos));
            res += dis + r-m+2;
            }
        System.out.println(res);
        }

        }
        }