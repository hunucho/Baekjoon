package silver;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_S2_1012 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int test = 0; test < T; test++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			int cnt = 0;
			boolean[][] arr = new boolean[n + 2][m + 2];
			int[] dx = { 1, -1, 0, 0 }, dy = { 0, 0, 1, -1 };
			Queue<Point> qp = new LinkedList<Point>();

			for (int i = 0; i < k; i++) {
				st = new StringTokenizer(br.readLine());
				int y = Integer.parseInt(st.nextToken());
				int x = Integer.parseInt(st.nextToken());
				arr[x+1][y+1] = true;
			}

			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= m; j++) {
					int temp = 0;
					if (arr[i][j]) {
						qp.add(new Point(i, j));
						arr[i][j] = false;
						temp = 1;
					}
					while (qp.size() > 0) {
						Point cur = qp.poll();
						for (int idx = 0; idx < 4; idx++) {
							if (arr[cur.x + dx[idx]][cur.y + dy[idx]]) {
								qp.add(new Point(cur.x + dx[idx], cur.y + dy[idx]));
								arr[cur.x + dx[idx]][cur.y + dy[idx]] = false;
								temp++;
							}
						}
					}
					if (temp > 0)
						cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}