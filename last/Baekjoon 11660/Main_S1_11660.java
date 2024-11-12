package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_S1_11660 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken());
		int [][] map = new int [n+2][n+2];
		int [][] dp = new int [n+2][n+2];
		for(int i=1;i<=n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1;j<=n;j++)
				map[i][j]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=1;j--) {	
				dp[i][j]=dp[i+1][j]+dp[i][j+1]-dp[i+1][j+1]+map[i][j];
			}
		}
		
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int x1=Integer.parseInt(st.nextToken()), y1=Integer.parseInt(st.nextToken());
			int x2=Integer.parseInt(st.nextToken()), y2=Integer.parseInt(st.nextToken());
			bw.write(dp[x1][y1]-dp[x2+1][y1]-dp[x1][y2+1]+dp[x2+1][y2+1]+"\n");
		}		
		bw.close();
	}
}