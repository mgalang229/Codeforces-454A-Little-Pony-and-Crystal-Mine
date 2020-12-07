import java.io.*;
import java.util.*;

public class Main {
	static final Reader in = new Reader();
	static final PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
//		int t=in.nextInt();
		int t=1;
		for(int i=1; i<=t; ++i)
			new Solver();
		out.close();
	}
	
	static class Solver {
		Solver() {
			int n=in.nextInt();
			Vector<Integer> v = new Vector<Integer>();
			for(int i=1; i<=n; i+=2)
				v.add(n-i);
			for(int i=n-2; i>=1; i-=2)
				v.add(n-i);
			for(int i=0; i<n; ++i) {
				for(int j=0; j<n; ++j) {
					if(j<v.get(i)/2||j>n-(v.get(i)/2+1))
						out.print('*');
					else
						out.print('D');
				}
				out.println();
			}
		}
	}
	
	static class Reader {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String next() {
			while(st==null||!st.hasMoreTokens()) {
				try {
					st=new StringTokenizer(in.readLine());
				} catch(Exception e) {}
			}	
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}

}
