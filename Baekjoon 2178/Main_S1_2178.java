package silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_S1_2178 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		boolean[][] map = new boolean[n + 2][m + 2];
		Queue<Integer> qx = new LinkedList<>();
		Queue<Integer> qy = new LinkedList<>();
		Queue<Integer> cnt = new LinkedList<>();
		sc.nextLine();
		for (int i = 1; i <= n; i++) {
			String s = sc.nextLine();
			for (int j = 1; j <= m; j++) {
				map[i][j] = s.charAt(j - 1) == '1' ? true : false;
			}
		}
		sc.close();
		qx.add(1);
		qy.add(1);
		cnt.add(1);
		int[] dx = { -1, 1, 0, 0 }, dy = { 0, 0, -1, 1 };
		int max=0;
		while (qx.size() > 0) {
			if(max<qx.size())
				max=qx.size();
			int x = qx.poll(), y = qy.poll(), c = cnt.poll();
			map[x][y] = false;
			if (x == n && y == m) {
				System.out.println(c);
				System.out.println(max);
				break;
			}
			for (int i = 0; i < 4; i++) {
				if (map[x + dx[i]][y + dy[i]]) {
					qx.add(x + dx[i]);
					qy.add(y + dy[i]);
					cnt.add(c + 1);
					map[x+dx[i]][y+dy[i]]=false;
				}
			}
		}
	}
}
