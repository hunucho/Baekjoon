package gold;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_G4_4485 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] dx = { 1, 0, -1, 0 }, dy = { 0, 1, 0, -1 };
		int tc=0;
		while (true) {
			tc++;
			int n = Integer.parseInt(br.readLine());
			if (n == 0)
				break;

			int[][] map = new int[n][n], dp = new int[n][n];

			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < n; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
					dp[i][j] = Integer.MAX_VALUE;
				}
			}
			dp[0][0] = map[0][0];
			Queue<Point> q = new LinkedList<Point>();
			q.add(new Point(0, 0));
			while (q.size() > 0) {
				Point cur = q.poll();
				for (int i = 0; i < 4; i++) {
					if (cur.x + dx[i] < 0 || cur.x + dx[i] >= n || cur.y + dy[i] < 0 || cur.y + dy[i] >= n)
						continue;
					if (dp[cur.x + dx[i]][cur.y + dy[i]] > dp[cur.x][cur.y] + map[cur.x + dx[i]][cur.y + dy[i]]) {
						dp[cur.x + dx[i]][cur.y + dy[i]] = dp[cur.x][cur.y] + map[cur.x + dx[i]][cur.y + dy[i]];
						q.add(new Point(cur.x + dx[i], cur.y + dy[i]));
					}
				}
			}
			System.out.printf("Problem %d: %d\n", tc,dp[n - 1][n - 1]);
		}
	}
}
