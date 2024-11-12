import java.util.*;

public class Main_S1_17271 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), m=sc.nextInt();
		int div=1000000007;
		int [] dp = new int[n+1];
		dp[0]=1;
		for(int i=1;i<=n;i++) {
			if(i-m>=0)
				dp[i]=Math.max(dp[i-1]+1, dp[i-m]+dp[i-1])%div;
			else
				dp[i]=dp[i-1]%div;
		}
		System.out.println(dp[n]);
	}
}
