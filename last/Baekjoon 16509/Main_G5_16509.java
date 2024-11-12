import java.io.*;
import java.util.*;

public class Main {
	static boolean[][] board;
	static int xs, ys, xe, ye, N = 10, M = 9;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		xs = sc.nextInt();
		ys = sc.nextInt();
		xe = sc.nextInt();
		ye = sc.nextInt();
		board = new boolean[10][9];
		board[xe][ye] = true;

		System.out.println(move());

	}

	public static int move() {
		int[] ddx = new int[] { 0, -1, 0, 1 }, ddy = new int[] { -1, 0, 1, 0 };
		int[] dx = new int[] { 1, -1, -1, 1 }, dy = new int[] { -1, -1, 1, 1 };
		int ans = -1;
		boolean[][] chk = new boolean[10][9];
		Queue<int[]> q = new LinkedList<int[]>();
		chk[xs][ys] = true;
		q.add(new int[] { xs, ys, 0 });

		while (q.size() > 0) {
			int[] cur = q.poll();
			int x = cur[0], y = cur[1], cnt = cur[2];

			for (int i = 0; i < 4; i++) {
				int nnx = x + ddx[i], nny = y + ddy[i];
				if (0 <= nnx && nnx < N && 0 <= nny && nny < M) {
					if (!board[nnx][nny]) {
						for (int j = 0; j < 2; j++) {
							int nx = nnx, ny = nny;
							for (int k = 0; k < 2; k++) {
								nx += dx[(i + j) % 4];
								ny += dy[(i + j) % 4];
								if (0 <= nx && nx < N && 0 <= ny && ny < M) {
									
									if (k == 1) {
										if (nx == xe && ny == ye)
											return cnt+1;
										if (!chk[nx][ny]) {
											q.add(new int[] { nx, ny, cnt + 1 });
											chk[nx][ny] = true;
										}
									}
									if(board[nx][ny])
										break;
								}
							}
						}

					}
				}
			}
		}

		return ans;
	}
}
