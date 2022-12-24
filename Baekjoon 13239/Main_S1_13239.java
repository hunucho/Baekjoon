package silver;

import java.util.*;

public class Main_S1_13239 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=0;t<T;t++) {
			int n=sc.nextInt(), k=sc.nextInt();
			int [][] dp = new int[n+2][k+2];
			dp[0][0]=dp[0][1]=dp[1][0]=1;
			for(int i=1;i<=n;i++) {
				for(int j=0;j<=k;j++)
					if(i==j || j==0)
						dp[i][j]=1;
					else
						dp[i][j]=(dp[i-1][j-1] + dp[i-1][j])%1000000007;
			}
			System.out.println(dp[n][k]);
		}				
	}
}
