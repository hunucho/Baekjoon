package gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_G3_10942_dp {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int [] arr = new int [n+1];
		// 행을 S, 열을 E로 생각해서 S->E로 가는 경로로 생각 
		int [][] dp = new int[n+1][n+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		// 한 칸일때는 무조건 팰린드롬
		for(int i=1;i<=n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			dp[i][i]=1;
		}
		// 두 칸일때는 같은 값으로 연속되면 팰린드롬 
		for(int i=1;i<n;i++)
			if(arr[i]==arr[i+1])
				dp[i][i+1]=1;
		// 3칸 일때부터는 길이를 2칸씩 먼곳부터 확인하면서 구간 팰린드롬을 검사한다
		for(int len=2;len<n;len++) {
			// 1번째 글자부터 갈 수 있는 길이를 체크
			for(int i=1;i+len<=n;i++) {
				// 현재 i번째 값과 len만큼 떨어진 값이 같고, 떨어진 값의 하나 밑이 같다면 그 이전까지는 펠린드롬을 만족하는 값임
				// 1 2 3 2 1
				// [1][2][3][4][5]은 펠린드롬
				// [2-4]가 펠린드롬인지 검사를 할때 [2][4]가 동일한지 판단 => 동일
				// [3]이 펠린드롬이기에 [2-4]는 펠린드롬을 만족
				// [1-5]가 펠린드롬이려면 [2-4]가 펠린드롬이어야 하고 윗줄에서 이미 만족을 했기에 [1][5]도 동일값이므로 펠린드롬임
				if(arr[i]==arr[i+len] && dp[i+1][i+len-1]==1)
					dp[i][i+len]=1;
			}
		}
		int m=Integer.parseInt(br.readLine());
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			// s->e로 가는 값이 1이면 펠린드롬임
			sb.append(dp[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())]+"\n");
		}
		System.out.println(sb.toString());
	}
}
