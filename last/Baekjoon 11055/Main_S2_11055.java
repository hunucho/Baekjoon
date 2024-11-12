package silver;

import java.util.*;

public class Main_S2_11055 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int [] A = new int[N], dp = new int [N];
		for(int i=0;i<N;i++)
			A[i]=sc.nextInt();
		for(int i=0;i<N;i++) {
			dp[i]=A[i];
			for(int j=0;j<i;j++) {
				if(A[j]<A[i] && dp[j]+A[i]>dp[i])
					dp[i]=dp[j]+A[i];
			}
		}
		int ans=0;
		for(int i=0;i<N;i++)
			ans=Math.max(ans, dp[i]);
		System.out.println(ans);
	}
}
