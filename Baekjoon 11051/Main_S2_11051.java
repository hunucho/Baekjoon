import java.io.*;
import java.util.*;

class Main {
	static long [][] arr;
	public static void main(String[] args) throws Exception {
		arr = new long [1001][1001];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());		
		int N=Integer.parseInt(st.nextToken()), K=Integer.parseInt(st.nextToken());
		System.out.println(f(N, K));		
	}	
	
	public static long f(int N, int K) {
		if(N<0 || K<0)
			return 0;
		if(arr[N][K]!=0)
			return arr[N][K];
		if(N==K) {
			arr[N][K]=1;
			return 1;
		} 
		return arr[N][K] = ( f(N-1, K) + f(N-1, K-1) ) % 10007; 
	}
}

