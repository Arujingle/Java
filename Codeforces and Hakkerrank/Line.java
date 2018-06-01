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
public class Line{
	public static void main(String[] arg){
		Scanner in=new Scanner(System.in);
		int[][] line1=new int[2][3];
		int[][] line2=new int[2][3];
		System.out.println("1 line cordinates: ");		
		for(int i=0;i<2;i++){
			String[] a=in.nextLine().split(" ");
			for(int j=0;j<3;j++){
				line1[i][j]=Integer.parseInt(a[j]);
			}
		}
		System.out.println("2 line cordinates: ");
		for(int i=0;i<2;i++){
			String[] a=in.nextLine().split(" ");
			for(int j=0;j<3;j++){
				line2[i][j]=Integer.parseInt(a[j]);
			}
		}
		double[][] xy=new double[2][3];
                double a1 = xy[0][0];
                double b1 = xy[0][1];
                double c1 = xy[0][2];
                double a2 = xy[1][0];
                double b2 = xy[1][1];
                double c2 = xy[1][2];
		a1=line1[0][1]-line1[1][1];
		b1=line1[1][0]-line1[0][0];
		c1=0-(line1[0][0]*a1+line1[0][1]*b1);
		a2=line2[0][1]-line2[1][1];
		b2=line2[1][0]-line2[0][0];
		c2=0-(line2[0][0]*a2+line2[0][1]*b2);
		double[] result=new double[3];
		if(a1*b2-b1*a2!=0){
			result[0]=(c1*b2-c2*b1)/(a1*b2-a2*b1);
			result[1]=(a1*c2-a2*c1)/(a1*b2-a2*b1);
		}
		double[][] yz=new double[2][3];
		double a3 = yz[0][0];
                double b3 = yz[0][1];
                double c3 = yz[0][2];
                double a4 = yz[1][0];
                double b4 = yz[1][1];
                double c4 = yz[1][2]; 
                a3=line1[0][2]-line1[1][2];
		b3=line1[1][1]-line1[0][1];
		c3=0-(line1[0][1]*a3+line1[0][2]*b3);
		a4=line2[0][2]-line2[1][2];
		b4=line2[1][1]-line2[0][1];
		c4=0-(line2[0][1]*a4+line2[0][2]*b4);
		if(a3*b4-b3*a4!=0){
			result[2]=(a3*c4-a4*c3)/(a3*b4-a4*b3);
		}
		for(double t:result){
			System.out.println(t);
		}
	}
}

