package gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_G5_4095 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			int max=0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken());
			if(n==0)
				break;
			int [][] arr = new int[n+1][m+1], dp = new int[n+1][m+1];
			
			for(int i=1;i<=n;i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=1;j<=m;j++)
					arr[i][j]=Integer.parseInt(st.nextToken());
			}
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=m;j++)
				{
					if(arr[i][j]==0)
						continue;
					int tmp = Math.min(Math.min(dp[i][j-1], dp[i-1][j]), dp[i-1][j-1]);
					dp[i][j]=tmp+1;
					if(max<dp[i][j])
						max=dp[i][j];
				}
			}
			System.out.println(max);		
		}
	}
}
