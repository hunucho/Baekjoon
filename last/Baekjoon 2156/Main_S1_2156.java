package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_S1_2156 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int[] arr = new int[n+1], dp = new int[n+1];
		for(int i=1;i<=n;i++)
			arr[i]=Integer.parseInt(br.readLine());
		if(n==1) {
			System.out.println(arr[1]);
			return;
		}
		else if(n==2) {
			System.out.println(arr[1]+arr[2]);
			return;
		}
		
		dp[1]=arr[1];
		dp[2]=arr[1]+arr[2];
//		dp[3]=Math.max(arr[1]+arr[2], arr[2]+arr[3]);
		
		for(int i=3;i<=n;i++) {
			dp[i] = Math.max(Math.max(dp[i-3]+arr[i-1]+arr[i], dp[i-2]+arr[i]),dp[i-1]);
			
		}
		int ans=0;
		for(int i=1;i<=n;i++)
			if(ans<dp[i])
				ans=dp[i];
		System.out.println(ans);
	}

}
