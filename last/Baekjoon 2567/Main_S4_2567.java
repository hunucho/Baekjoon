package silver;

import java.util.Scanner;

public class Main_S4_2567 {
	public static void main(String[] args) {
		boolean[][] map = new boolean[102][102];
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), cnt = 0;
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt(), y = sc.nextInt();
			for (int j = 1; j <= 10; j++)
				for (int k = 1; k <= 10; k++)
					map[x + j][y + k] = true;
		}
		boolean previ = false, prevj = false;
		for (int i = 0; i < 102; i++)
			for (int j = 0; j < 102; j++) {
				if (map[i][j] != previ) {
					previ = !previ;
					cnt++;
				}
				if (map[j][i] != prevj) {
					prevj = !prevj;
					cnt++;
				}
			}
		System.out.println(cnt);
	}
}
