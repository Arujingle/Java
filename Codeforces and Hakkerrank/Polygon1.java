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
public class Polygon1{
	public static void main(String[] arg){
		Scanner in=new Scanner(System.in);
                System.out.println("Enter number of vertex: ");
		int n=Integer.parseInt(in.nextLine());
		int[][] points=new int[n][2];
		String[] p;
		for(int i = 0;i < n;i++){
			p=in.nextLine().split(" ");
			for(int j = 0;j<2;j++){
				points[i][j]=Integer.parseInt(p[j]);
			}
		}
		
		double[] s=new double[n];
		double[] va=new double[n];
		int[] point1=points[0];
		for(int k=0;k<n;k++){
			int[] point2=points[k];
			int[] point3=points[k+1==n?0:k+1];
			double a=Math.sqrt(Math.pow(point1[0]-point2[0],2)+Math.pow(point1[1]-point2[1],2));
			double b=Math.sqrt(Math.pow(point1[0]-point3[0],2)+Math.pow(point1[1]-point3[1],2));
			double c=Math.sqrt(Math.pow(point3[0]-point2[0],2)+Math.pow(point3[1]-point2[1],2));
			double per=(a+b+c)/2;
			s[k]=Math.sqrt(per*(per-a)*(per-b)*(per-c));
			va[k]=point2[0]*point3[1]-point2[1]*point3[0];
		}
		double Heron=0;
		double sp=0;
		for(int q=0;q<s.length;q++){
			Heron+=s[q];
			sp+=va[q];
		}
		System.out.println("Heron: "+Heron);
		System.out.println("Second: "+Math.abs(sp/2));
	}
}

