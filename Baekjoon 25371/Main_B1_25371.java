import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()), k=Integer.parseInt(st.nextToken());
		long tmp=0;
		st = new StringTokenizer(Integer.toString(n,k), "0");
		while(st.hasMoreTokens())
			tmp+=Long.parseLong(st.nextToken());
		System.out.println(Long.toString(tmp, k));
	}
}
