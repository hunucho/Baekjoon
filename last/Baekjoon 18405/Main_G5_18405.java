import java.io.*;
import java.util.*;

public class Main {
	static int[][] virus;
	static Queue<int[]> q;
	static int N, K, S, X, Y;
	static boolean[][] chk;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		q = new LinkedList<int[]>();
		virus = new int[N][N];
		chk = new boolean[N][N];
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				virus[i][j] = sc.nextInt();
		for (int k = 1; k <= K; k++)
			for (int i = 0; i < N; i++)
				for (int j = 0; j < N; j++)
					if (virus[i][j] == k) {
						q.add(new int[] { i, j, k, 0 });
						chk[i][j]=true;
					}
		S = sc.nextInt();
		X = sc.nextInt();
		Y = sc.nextInt();

		System.out.println(breed());
		System.out.println();
	}

	public static int breed() {
		int[] dx = new int[] { -1, 1, 0, 0 }, dy = new int[] { 0, 0, -1, 1 };

		while (q.size() > 0) {
			int[] cur = q.poll();
			int x = cur[0], y = cur[1], num = cur[2], cnt = cur[3];
			if (cnt == S)
				return virus[X - 1][Y - 1];
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i], ny = y + dy[i];
				if (0 <= nx && nx < N && 0 <= ny && ny < N) {
					if (!chk[nx][ny]) {
						virus[nx][ny] = num;
						q.add(new int[] { nx, ny, num, cnt + 1 });
						chk[nx][ny] = true;
					}
				}
			}
		}

		return virus[X - 1][Y - 1];

	}
}
