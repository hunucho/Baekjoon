import java.util.*;

public class Main {
	static int N, ans;
	static boolean[][] wall;
	static int[][][] map;
	static Queue<int[]> q;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		wall = new boolean[N + 1][N + 1];
		for (int i = 1; i <= N; i++)
			for (int j = 1; j <= N; j++)
				if (sc.nextInt() == 1)
					wall[i][j] = true;
		map = new int[N + 1][N + 1][3];
		map[1][2][0] = 1;
		for (int i = 1; i <= N; i++) {
			for (int j = 2; j <= N; j++) {
				if (wall[i][j])
					continue;

				map[i][j][0] += map[i][j - 1][0] + map[i][j - 1][2];
				map[i][j][1] += map[i - 1][j][1] + map[i - 1][j][2];
				if (wall[i - 1][j] || wall[i][j - 1])
					continue;
				map[i][j][2] += map[i - 1][j - 1][0] + map[i - 1][j - 1][1] + map[i - 1][j - 1][2];
			}
		}
		for (int k = 0; k < 3; k++)
			ans += map[N][N][k];
		System.out.println(ans);
	}
}
