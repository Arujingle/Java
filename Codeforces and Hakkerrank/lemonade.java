
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class lemonade{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
long L = scan.nextLong();
long[] c = new long[33];
for(int i=0;i<n;++i)c[i] = scan.nextLong();
for(int i=1;i<n;++i)c[i] = Math.min(c[i] , 2*c[i-1]);
for(int i=n;i<33;++i)c[i]= c[i-1]*2;
long ans = Long.MAX_VALUE;
long now = 0;
for(int i=31;i>=0;--i){
ans = Math.min(ans, now + c[i+1]);
   if(((L»i)&1)==1){
now += c[i];
}
}
ans = Math.min(ans,now);
System.out.println(ans);
}
}
