package gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_G4_17144 {
	public static void spread(int[][] map, int r, int c) {
		int[][] newmap = new int[r + 1][c + 1];
		int[] dx = new int[] { -1, 1, 0, 0 }, dy = new int[] { 0, 0, -1, 1 };
		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= c; j++) {
				if (map[i][j] != -1) {
					int cnt = 0, temp = 0;
					for (int k = 0; k < 4; k++) {
						if (i + dx[k] >= 1 && i + dx[k] <= r && j + dy[k] >= 1 && j + dy[k] <= c) {
							if (map[i + dx[k]][j + dy[k]] != -1 && map[i][j] >= 5) {
								newmap[i + dx[k]][j + dy[k]] += map[i][j] / 5;
								temp += map[i][j] / 5;
							}
						}
					}
					newmap[i][j] += map[i][j] - temp;
				} else
					newmap[i][j] = map[i][j];
			}
		}
		for (int i = 1; i <= r; i++)
			for (int j = 1; j <= c; j++)
				map[i][j] = newmap[i][j];
	}

	public static void aircleaner(int[][] map, int r, int c) {
		int loc = 0;
		for (int i = 1; i <= r; i++)
			if (map[i][1] == -1) {
				loc = i;
				break;
			}
		// 상단
		for (int i = loc - 1; i >= 1; i--)
			map[i][1] = map[i - 1][1];
		for (int j = 1; j <= c - 1; j++)
			map[1][j] = map[1][j + 1];
		for (int i = 1; i <= loc - 1; i++)
			map[i][c] = map[i + 1][c];
		for (int j = c; j >= 2; j--)
			map[loc][j] = map[loc][j - 1];
		map[loc][2] = 0;
		// 하단
		for (int i = loc + 2; i <= r - 1; i++)
			map[i][1] = map[i + 1][1];
		for (int j = 1; j <= c - 1; j++)
			map[r][j] = map[r][j + 1];
		for (int i = r; i >= loc + 1; i--)
			map[i][c] = map[i - 1][c];
		for (int j = c; j >= 2; j--)
			map[loc + 1][j] = map[loc + 1][j - 1];
		map[loc + 1][2] = 0;

	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken()),
				t = Integer.parseInt(st.nextToken());
		int[] cleaner = new int[2];
		int[][] map = new int[r + 1][c + 1];
		for (int i = 1; i <= r; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= c; j++)
				map[i][j] = Integer.parseInt(st.nextToken());
		}
		for (int k = 0; k < t; k++) {
			spread(map, r, c);
			aircleaner(map, r, c);
		}
		int sum=0;
		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= c; j++) {
				if(map[i][j]!=-1)
					sum+=map[i][j];
			}
		}
		System.out.println(sum);
	}
}
