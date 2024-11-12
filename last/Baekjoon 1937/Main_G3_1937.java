package gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_G3_1937 {
	static int [][] arr, dp;
	static int n;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		dp = new int[n][n];
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<n;j++)
				arr[i][j]=Integer.parseInt(st.nextToken());
		}
		
		int temp=0, ans=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				temp=dir(i,j);
				if(temp>ans)
					ans=temp;
			}
		}
		System.out.println(ans);
	}
	static int dir(int x,int y) {
		if(dp[x][y]!=0)
			return dp[x][y];
		dp[x][y]=1;
		
		int [] dx = {1,-1,0,0}, dy= {0,0,1,-1};
		for(int i=0;i<4;i++)
		{
			if(x+dx[i]<0 || x+dx[i]>=n ||y+dy[i]<0 || y+dy[i]>=n)
				continue;
			if(arr[x][y]<arr[x+dx[i]][y+dy[i]]) {
				dp[x][y]=Math.max(dp[x][y], dir(x+dx[i],y+dy[i])+1);
				
			}
		}
		return dp[x][y];
	}

}
