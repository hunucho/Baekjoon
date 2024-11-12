import java.util.*;

public class Main {
	static char[][] arr;
	static int W = 6, H = 12;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		arr = new char[H][W];
		for (int i = 0; i < H; i++)
			arr[i] = sc.next().toCharArray();
		int ans = 0;
		while (Find()) {
			Pull();
			ans++;
		}
		System.out.println(ans);

	}

	public static boolean Find() {

		boolean flag = false;

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (arr[i][j] != '.')
					flag |= Boom(i, j, arr[i][j]);
			}
		}

		return flag;
	}

	public static boolean Boom(int x, int y, char color) {
		int[] dx = new int[] { -1, 1, 0, 0 }, dy = new int[] { 0, 0, -1, 1 };
		Queue<int[]> q = new LinkedList<>(), dq = new LinkedList<int[]>();
		boolean[][] chk = new boolean[H][W];
		int cnt = 1;
		chk[x][y] = true;
		q.add(new int[] { x, y });
		dq.add(new int[] { x, y });

		while (q.size() > 0) {
			int[] cur = q.poll();
			int curx = cur[0], cury = cur[1];
			for (int i = 0; i < 4; i++) {
				int nx = curx + dx[i], ny = cury + dy[i];
				if (nx < 0 || nx >= H || ny < 0 || ny >= W)
					continue;
				if (arr[nx][ny] == color && !chk[nx][ny]) {
					chk[nx][ny] = true;
					q.add(new int[] { nx, ny });
					dq.add(new int[] { nx, ny });
					cnt++;
				}
			}
		}
		if (cnt >= 4) {
			while (dq.size() > 0) {
				int[] cur = dq.poll();
				arr[cur[0]][cur[1]] = '.';
			}
			return true;
		}
		return false;
	}

	public static void Pull() {
		for (int j = 0; j < W; j++) {
			int k = H - 1;
			for (int i = H - 1; i >= 0; i--) {
				if (arr[i][j] != '.') {
					if (k == i)
						k--;
					else {
						arr[k--][j] = arr[i][j];
						arr[i][j] = '.';
					}
				}
			}
		}
	}
}
