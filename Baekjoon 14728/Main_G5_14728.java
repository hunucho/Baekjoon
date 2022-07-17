package gold;

import java.io.*;
import java.util.*;

public class Main_G5_14728 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()), t=Integer.parseInt(st.nextToken());
		int [] dp = new int [t+1];
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			int k, s;
			k=Integer.parseInt(st.nextToken());
			s=Integer.parseInt(st.nextToken());
			for(int j=t;j>=k;j--) {
				dp[j]=Math.max(dp[j], dp[j-k]+s);
			}
		}
		System.out.println(dp[t]);
	}
}
