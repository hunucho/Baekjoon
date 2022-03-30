package gold;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_G4_2638 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int height = Integer.parseInt(st.nextToken()), width = Integer.parseInt(st.nextToken());
		int cheesecnt = 0, time = 0;
		boolean[][] cheese = new boolean[height][width];

		// make cheese map
		for (int i = 0; i < height; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < width; j++) {
				if (st.nextToken().equals("1"))
					cheese[i][j] = true;
				if (cheese[i][j])
					cheesecnt++;
			}
		}

		int[] dx = { 1, -1, 0, 0 }, dy = { 0, 0, 1, -1 };
		while (cheesecnt > 0) {
			boolean[][] chk = new boolean[height][width];
			int[][] cnt = new int[height][width];
			Queue<Point> q = new LinkedList<Point>();
			q.add(new Point(0, 0));
			chk[0][0] = true;
			while (q.size() > 0) {
				int x = q.peek().x;
				int y = q.peek().y;
				q.poll();
				for (int k = 0; k < 4; k++) {
					// 방문한 곳부터 4방을 카운팅 함
					if (x + dx[k] < 0 || x + dx[k] >= height || y + dy[k] < 0 || y + dy[k] >= width) 
						continue;
					cnt[x + dx[k]][y + dy[k]]++;
					
					// 이미 방문한 위치에 대해서는 더 이상 BFS를 수행하지 않음
					if( chk[x + dx[k]][y + dy[k]])
						continue;
					
					// 현재 방문한 위치가 치즈가 있는 위치가 아닐경우에만 그 자리를 기준으로 BFS 실행
					if (!cheese[x + dx[k]][y + dy[k]])
						q.add(new Point(x + dx[k], y + dy[k]));
					chk[x + dx[k]][y + dy[k]] = true;					
				}
			}
			// 전체를 탐색하며 2면이 치즈가 아닌 위치와 인접하며, 치즈인 경우 치즈가 사라짐
			for (int i = 0; i < height; i++) {
				for (int j = 0; j < width; j++) {
					if (cnt[i][j] >= 2 && cheese[i][j]) {
						cheese[i][j] = false;
						cheesecnt--;
					}
				}
			}
			time++;
		}
		System.out.println(time);
	}
}
