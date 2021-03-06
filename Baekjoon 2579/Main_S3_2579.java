package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_S3_2579 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		int [] stairs = new int [n+1], dp = new int[n+1];
		for(int i=1;i<=n;i++)
			stairs[i]=Integer.parseInt(br.readLine());
		dp[1]=stairs[1];
		if(n>=2)
			dp[2]=stairs[2]+stairs[1];		
		if(n>=3)
			for(int i=3;i<=n;i++)
				dp[i]=Math.max(dp[i-3]+stairs[i-1]+stairs[i], dp[i-2]+stairs[i]);
		System.out.println(dp[n]);
	}
}
