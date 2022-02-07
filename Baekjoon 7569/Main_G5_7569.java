package gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_G5_7569 {
	static int n, m, h, cnt;
	static boolean[][][] visited;
	static int arr[][][];
	static Queue<int[]> q;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());
		cnt = m * n * h;
		q = new LinkedList<int[]>();
		arr = new int[n][m][h];
		visited = new boolean[n][m][h];
		for (int k = 0; k < h; k++) {
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < m; j++) {

					int temp = Integer.parseInt(st.nextToken());
					arr[i][j][k] = temp;
					if (temp == -1) {
						cnt--;
						visited[i][j][k] = true;
					} else if (temp == 1) {
						cnt--;
						visited[i][j][k] = true;
						q.add(new int[] { i, j, k, 0 });
					}
				}

			}
		}
		System.out.println(bfs());
	}

	public static int bfs() {
		int day = 0;
		int[] dx = { -1, 1, 0, 0, 0, 0 }, dy = { 0, 0, -1, 1, 0, 0 }, dz = { 0, 0, 0, 0, 1, -1 };
		while (q.size() > 0 || cnt > 0) {
			int[] dir = q.poll();
			if (dir == null)
				break;
			for (int i = 0; i < 6; i++) {
				if (dir[0] + dx[i] >= 0 && dir[0] + dx[i] < n && dir[1] + dy[i] >= 0 && dir[1] + dy[i] < m
						&& dir[2] + dz[i] >= 0 && dir[2] + dz[i] < h
						&& visited[dir[0] + dx[i]][dir[1] + dy[i]][dir[2] + dz[i]] == false) {
					q.add(new int[] { dir[0] + dx[i], dir[1] + dy[i], dir[2] + dz[i], dir[3] + 1 });
					visited[dir[0] + dx[i]][dir[1] + dy[i]][dir[2] + dz[i]] = true;
					cnt--;
					day = dir[3] + 1;
				}
			}
		}
		if (cnt == 0)
			return day;
		else
			return -1;
	}
}
