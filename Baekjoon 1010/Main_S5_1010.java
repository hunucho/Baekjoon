package silver;

import java.io.*;
import java.util.*;

public class Main_S5_1010 {
	static int[][] dp =new int [30][30];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<30;i++)
			dp[i][0]=dp[i][i]=1;
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			bw.write(String.valueOf(combi(m, n)) + "\n");
		}
		bw.close();
	}

	static int combi(int n, int m) {
		if (n == 0 || m == 0 || dp[n][m]>0)
			return dp[n][m];
		else
			return dp[n][m]=combi(n - 1, m - 1) + combi(n - 1, m);
	}
}
