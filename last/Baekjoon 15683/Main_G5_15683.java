package gold;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_G5_15683 {
	static ArrayList<int[]> cctv = new ArrayList<int[]>();
	static int[][] original, map;
	static int[] turn;
	static int n, m, cctvcnt, minblind;

	public static void f() {
		while (true) {
			
			if (turn[0] == 5)
				return;
			copymap();

			for (int i = 0; i < cctvcnt; i++) {
				int x = cctv.get(i)[0];
				int y = cctv.get(i)[1];

				if (map[x][y] == 1)
					turn1(x, y, turn[i]);
				else if (map[x][y] == 2)
					turn2(x, y, turn[i]);
				else if (map[x][y] == 3)
					turn3(x, y, turn[i]);
				else if (map[x][y] == 4)
					turn4(x, y, turn[i]);
				else if (map[x][y] == 5)
					turn5(x, y);

			}
			getblindspot();
			if(minblind==0)
				return;

			turn[cctvcnt - 1]++;
			int i = 0;
			if (turn[cctvcnt - 1 - i] > 3) {
				while (i < cctvcnt - 1) {
					turn[cctvcnt - 1 - i - 1] += turn[cctvcnt - 1 - i] / 4;
					turn[cctvcnt - 1 - i] %= 4;
					i++;

				}
			}
		}
	}

	public static void right(int x, int y) {
		int j = y;
		while (j + 1 < m && map[x][j] != 6) {
			j++;
			if (map[x][j] == 0)
				map[x][j] = -1;
		}
	}

	public static void left(int x, int y) {
		int j = y;
		while (j - 1 >= 0 && map[x][j] != 6) {
			j--;
			if (map[x][j] == 0)
				map[x][j] = -1;
		}
	}

	public static void up(int x, int y) {
		int i = x;
		while (i - 1 >= 0 && map[i][y] != 6) {
			i--;
			if (map[i][y] == 0)
				map[i][y] = -1;
		}
	}

	public static void down(int x, int y) {
		int i = x;
		while (i + 1 < n && map[i][y] != 6) {
			i++;
			if (map[i][y] == 0)
				map[i][y] = -1;
		}
	}

	public static void turn1(int x, int y, int z) {
		if (z == 0)
			right(x, y);
		else if (z == 1)
			down(x, y);
		else if (z == 2)
			left(x, y);
		else if (z == 3)
			up(x, y);
	}

	public static void turn2(int x, int y, int z) {
		if (z == 0 || z == 2) {
			left(x, y);
			right(x, y);
		} else if (z == 1 || z == 3) {
			up(x, y);
			down(x, y);
		}
	}

	public static void turn3(int x, int y, int z) {
		if (z == 0 || z == 1)
			right(x, y);
		else if (z == 2 || z == 3)
			left(x, y);
		if (z == 0 || z == 3)
			up(x, y);
		else if (z == 1 || z == 2)
			down(x, y);
	}

	public static void turn4(int x, int y, int z) {
		if (z == 0) {
			right(x, y);
			left(x, y);
			up(x, y);
		} else if (z == 1) {
			right(x, y);
			up(x, y);
			down(x, y);
		} else if (z == 2) {
			right(x, y);
			left(x, y);
			down(x, y);
		} else if (z == 3) {
			left(x, y);
			up(x, y);
			down(x, y);
		}
	}

	public static void turn5(int x, int y) {
		right(x, y);
		left(x, y);
		up(x, y);
		down(x, y);
	}

	public static void getblindspot() {
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				if (map[i][j] == 0)
					temp++;
		}
		if (temp < minblind)
			minblind = temp;
	}

	public static void copymap() {
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				map[i][j] = original[i][j];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		original = new int[n][m];
		map = new int[n][m];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++) {
				original[i][j] = sc.nextInt();
				if(original[i][j]==0)
					minblind++;
				if (original[i][j] != 0 && original[i][j] != 6) {
					cctvcnt++;
					cctv.add(new int[] { i, j });
				}

			}
		turn = new int[cctvcnt];
		if(cctvcnt>0)
			f();
		System.out.println(minblind);
	}
}
