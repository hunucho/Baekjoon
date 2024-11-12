import java.util.*;

public class Main {
	static int N, M;
	static int[][] iceberg;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		iceberg = new int[N][M];
		for (int i = 0; i < N; i++)
			for (int j = 0; j < M; j++)
				iceberg[i][j] = sc.nextInt();
		int ans = 0, cnt = 0;
		while (isMelted()) {
			cnt++;
			if (isDivided()) {
				ans = cnt;
				break;
			}				
		}
		System.out.println(ans);
	}

	public static boolean isMelted() {
		boolean rtn = false;
		int[][] temp = new int[N][M];
		int[] dx = new int[] { -1, 1, 0, 0 }, dy = new int[] { 0, 0, -1, 1 };
		for (int i = 0; i < N; i++)
			for (int j = 0; j < M; j++)
				if (iceberg[i][j] > 0) {
					temp[i][j] = iceberg[i][j];
					for (int k = 0; k < 4; k++)
						if (iceberg[i + dx[k]][j + dy[k]] == 0) {
							temp[i][j] = Math.max(0, temp[i][j] - 1);
							rtn = true;
						}
				}

		for (int i = 0; i < N; i++)
			for (int j = 0; j < M; j++)
				iceberg[i][j] = temp[i][j];
		return rtn;
	}

	public static boolean isDivided() {
		boolean[][] chk = new boolean[N][M];
		int[] dx = new int[] { -1, 1, 0, 0 }, dy = new int[] { 0, 0, -1, 1 };

		Queue<int[]> q = new LinkedList<>();
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++)
				if (!chk[i][j] && iceberg[i][j] > 0) {
					cnt++;
					q.add(new int[] { i, j });
					chk[i][j] = true;
					while (q.size() > 0) {
						int[] cur = q.poll();
						int x = cur[0], y = cur[1];
						for (int k = 0; k < 4; k++) {
							int nx = x + dx[k], ny = y + dy[k];
							if (0 < nx && nx < N && 0 < ny && ny < M) {
								if (!chk[nx][ny] && iceberg[nx][ny] > 0) {
									chk[nx][ny] = true;
									q.add(new int[] { nx, ny });
								}
							}
						}
					}
				}
		}

		if (cnt > 1)
			return true;
		return false;
	}

}
