import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		long [][] dp = new long [65][65];
		for(int i=0;i<=9;i++)
			dp[1][i]=1;
		for(int i=2;i<=64;i++) {
			for(int j=0;j<=9;j++)
				for(int k=j;k<=9;k++)
					dp[i][j]+=dp[i-1][k];
		}
		for(int t=0;t<T;t++) {
			int n=sc.nextInt();
			long ans=0;			
			for(int j=0;j<=9;j++)
				ans+=dp[n][j];
			System.out.println(ans);
		}	
	}
}
