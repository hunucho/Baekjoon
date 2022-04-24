package silver;

import java.util.Scanner;

public class Main_S4_13699 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Long [] dp=new Long [40];
		dp[0]=(long) 1;
		for(int i=1;i<=35;i++) {
			dp[i]=(long) 0;
			for(int j=0;j<i;j++)
				dp[i]+=dp[j]*(dp[i-j-1]);
		}
		System.out.println(dp[n]);
	}
}
