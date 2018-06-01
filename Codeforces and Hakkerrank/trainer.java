/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
    import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class trainer {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int n = sc.nextInt(), k = sc.nextInt();
		int[] ranks = new int[k + 1];
		while(n-->0)
			ranks[sc.nextInt()]++;
		int ans = 0;
		while(true)
		{
			boolean[] take = new boolean[k];
			boolean takeOne = false;
			for(int j = 1; j < k; ++j)
				if(ranks[j] > 0)
				{
					ranks[j]--;
					takeOne = take[j] = true;				}
			if(!takeOne)
				break;
			++ans;
			for(int j = 1; j < k; ++j)
				if(take[j])
					ranks[j + 1]++;
				
		}
		out.println(ans);
		out.flush();
		out.close();
	}

	static class Scanner 
	{
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s){  
		br = new BufferedReader(new InputStreamReader(s));
		}

		public String next() throws IOException 
		{
			while (st == null || !st.hasMoreTokens()) 
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public double nextDouble() throws NumberFormatException, IOException
		{
			return Double.parseDouble(next());
		}

		public int nextInt() throws IOException {return Integer.parseInt(next());}

		public long nextLong() throws IOException {return Long.parseLong(next());}

		public String nextLine() throws IOException {return br.readLine();}

		public boolean ready() throws IOException {return br.ready();}


	}
} 

