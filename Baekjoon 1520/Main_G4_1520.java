package gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_G4_1520 {

	static int [][] map, dp;
	static int[] dx = { -1, 1, 0, 0 }, dy = { 0, 0, -1, 1 };
	static int n,m;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		map = new int[n][m];
		dp = new int[n][m];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				dp[i][j]=-1;
			}
		}
		System.out.println(DFS(0,0));
	}
	
	static int DFS(int x, int y) {
		// 마지막 점에 도착하면 1을 반환해서 경로의 갯수를 증가
		if(x==n-1 && y==m-1)
			return 1;
		// 이미 방문한 위치라면 그 위치까지 올 수 있었던 갯수를 반환함
		else if(dp[x][y]!=-1)
			return dp[x][y];
		// 방문시 0으로 체크해서 돌아가는 길에 증가 되지 않도록 함
		dp[x][y]=0;
		for (int i = 0; i < 4; i++) {
			if (x + dx[i] >= 0 && x + dx[i] < n && y + dy[i] >= 0 && y + dy[i] < m) {
				if (map[x + dx[i]][y + dy[i]] < map[x][y]) {	// 다음 방문할 위치가 현재의 위치보다 크다면
					dp[x][y]+=DFS(x + dx[i], y+dy[i]);	// 깊이 우선 탐색을 함
				}
			}
		}
		return dp[x][y];	// 자신의 자리를 반환
	}
}
