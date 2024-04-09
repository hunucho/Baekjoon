import java.io.*;
import java.util.*;

class Main {
	static boolean[][] map;
	// true : ally, false : wall
	static int N, M, K;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		map = new boolean[N + 1][M + 1];
		for (int i = 0; i < N; i++) {
			String tmp = br.readLine();
			for (int j = 0; j < M; j++)
				if (tmp.charAt(j) == '0')
					map[i + 1][j + 1] = true;
		}

		int ans = -1;

		boolean[][][] visited = new boolean[N + 1][M + 1][K + 1];

		for (int i = 0; i < K; i++)
			visited[1][1][i] = true;

		int[] dx = { -1, 1, 0, 0 }, dy = { 0, 0, -1, 1 };
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[] { 1, 1, 0, 1 });

		while (q.size() > 0) {
			int[] cur = q.poll();
			int curx = cur[0], cury = cur[1], curbreak = cur[2], curcnt = cur[3];

			if (curx == N && cury == M) {
				ans = curcnt;
				break;
			}

			for (int i = 0; i < 4; i++) {
				int nx = curx + dx[i], ny = cury + dy[i], ncnt = curcnt + 1;

				if (nx < 1 || nx > N || ny < 1 || ny > M)
					continue;

				if (!map[nx][ny] && curbreak < K && !visited[nx][ny][curbreak+1]) {
					visited[nx][ny][curbreak + 1] = true;
					q.add(new int[] { nx, ny, curbreak + 1, ncnt });
				} else if (map[nx][ny] && !visited[nx][ny][curbreak]) {
					visited[nx][ny][curbreak] = true;
					q.add(new int[] { nx, ny, curbreak, ncnt });
				}

			}
		}
		System.out.println(ans);
	}
}
