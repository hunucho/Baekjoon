import java.io.*;
import java.util.*;

public class Main {
	static int[][] map, ans;
	static int mincnt = 999;
	static boolean repeat = true;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		map = new int[9][9];
		ans = new int[9][9];

		int cnt = 0;
		for (int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if (map[i][j] == 0)
					cnt++;
			}
		}

		Sudoku(cnt);
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++)
				sb.append(ans[i][j] + " ");
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}

	public static void Sudoku(int cnt) {
		if(!repeat)
			return;
		if (cnt <= 0) {
			repeat=false;
			for (int i = 0; i < 9; i++)
				for (int j = 0; j < 9; j++)
					ans[i][j] = map[i][j];
			return;
		}
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (map[i][j] == 0) {
					for (int k = 1; k <= 9; k++) {
						if (isValid(i, j, k)) {
							map[i][j] = k;
							Sudoku(cnt - 1);
						}
					}
					map[i][j] = 0;
					return;
				}
			}
		}
	}

	public static boolean isValid(int x, int y, int k) {
		for (int i = 0; i < 9; i++)
			if (map[i][y] == k)
				return false;
		for (int j = 0; j < 9; j++)
			if (map[x][j] == k)
				return false;
		for (int i = (x / 3) * 3; i < (x / 3) * 3 + 3; i++)
			for (int j = (y / 3) * 3; j < (y / 3) * 3 + 3; j++)
				if (map[i][j] == k)
					return false;
		return true;
	}

}
 
//0 0 0 0 0 0 0 0 0
//0 0 0 0 0 0 0 0 0
//0 0 0 0 0 0 0 0 0
//0 0 0 0 0 0 0 0 0
//0 0 0 0 0 0 0 0 0
//0 0 0 0 0 0 0 0 0
//0 0 0 0 0 0 0 0 0
//0 0 0 0 0 0 0 0 0
//0 0 0 0 0 0 0 0 0
