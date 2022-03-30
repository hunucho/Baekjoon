package gold;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_G4_1600 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());

		int[] dx = { 1, 0, 0, -1 }, dy = { 0, 1, -1, 0 };
		int[] hdx = { 2,1,-1,-2,1,2,-1,-2 }, hdy = { 1,2,2,1,-2,-1,-2,-1 };
		
		boolean[][] map = new boolean[h][w];
		boolean[][][] visited = new boolean[h][w][k + 1];

		for (int i = 0; i < h; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < w; j++) {
				if (st.nextToken().equals("1"))
					map[i][j] = true;
			}
		}
		Queue<Point> qpos = new LinkedList<Point>();
		Queue<Integer> horse = new LinkedList<Integer>(), curcnt = new LinkedList<Integer>();

		qpos.add(new Point(0, 0));
		horse.add(0);
		curcnt.add(0);
		visited[0][0][0] = true;
		while (qpos.size() > 0) {
			int x = qpos.peek().x, y = qpos.peek().y;
			qpos.poll();
			int curh = horse.poll();
			int cur = curcnt.poll();

			if (x == h - 1 && y == w - 1) {
				System.out.println(cur);
				return;
			}

			if (curh < k) {
				for (int i = 0; i < 8; i++) {
					if (x + hdx[i] < 0 || x + hdx[i] >= h || y + hdy[i] < 0 || y + hdy[i] >= w)
						continue;
					if (map[x + hdx[i]][y + hdy[i]] || visited[x + hdx[i]][y + hdy[i]][curh+1])
						continue;
					qpos.add(new Point(x + hdx[i], y + hdy[i]));
					horse.add(curh + 1);
					curcnt.add(cur + 1);
					visited[x + hdx[i]][y + hdy[i]][curh+1] = true;
				}
			}
			for (int i = 0; i < 4; i++) {
				if (x + dx[i] < 0 || x + dx[i] >= h || y + dy[i] < 0 || y + dy[i] >= w)
					continue;
				if (map[x + dx[i]][y + dy[i]] || visited[x + dx[i]][y + dy[i]][curh])
					continue;
				qpos.add(new Point(x + dx[i], y + dy[i]));
				horse.add(curh);
				curcnt.add(cur + 1);
				visited[x + dx[i]][y + dy[i]][curh] = true;
			}
		}
		System.out.println(-1);
	}
}
