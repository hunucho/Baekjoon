package silver;

import java.util.*;

public class Main_S2_11722 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(), ans=0;
		int [] A = new int [N], dp = new int [N];
		for(int i=0;i<N;i++)
			A[i]=sc.nextInt();
		for(int i=0;i<N;i++) {
			dp[i]=1;
			for(int j=0;j<i;j++) {
				if(A[j]>A[i] && dp[j]+1>dp[i])
					dp[i]=dp[j]+1;
			}
			ans=Math.max(ans, dp[i]);
		}
		System.out.println(ans);
	}
}
