import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(),":");
		int n=Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken());
		int gcd = gcd(n,m);
		System.out.println(n/gcd+":"+m/gcd);
	}
	
	public static int gcd(int n, int m) {
		if(m==0)
			return n;
		else
			return gcd(m, n%m);			
	}
}
