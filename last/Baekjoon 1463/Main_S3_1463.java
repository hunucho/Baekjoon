package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_S3_1463 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x=Integer.parseInt(br.readLine()), cnt=0;
		int[] dp=new int[x+10];
		dp[1]=0;
		dp[2]=1;
		dp[3]=1;
		for(int i=2;i<=x;i++) {
			if(i%6==0)
				dp[i]=Math.min(dp[i/3]+1, dp[i/2]+1);
			else if(i%3==0)
				dp[i]=Math.min(dp[i/3]+1, dp[i-1]+1);
			else if(i%2==0)
				dp[i]=Math.min(dp[i/2]+1, dp[i-1]+1);
			else
				dp[i]= dp[i-1]+1;
		}
		System.out.println(dp[x]);
	}
}
