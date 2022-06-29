package silver;

import java.io.*;
import java.util.*;

public class Main_S2_11048 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken());
		int [][] arr = new int [n+2][m+2], dp = new int[n+2][m+2];
		for(int i=1;i<=n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1;j<=m;j++)
				arr[i][j]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++)
				dp[i][j]=Math.max(dp[i-1][j]+arr[i][j], dp[i][j-1]+arr[i][j]);
		}
		System.out.println(dp[n][m]);		
	}
}
