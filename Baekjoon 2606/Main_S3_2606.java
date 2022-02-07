package silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_S3_2606 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		boolean[][] map = new boolean[n + 1][n + 1];
		boolean[] chk = new boolean[n + 1];
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < m; i++) {
			int s = sc.nextInt(), e = sc.nextInt();
			map[s][e] = map[e][s] = true;
		}
		q.add(1);
		while (q.size() > 0) {
			int i = q.poll();
			chk[i] = true;
			for (int j = 1; j <= n; j++) {
				if (map[i][j]) {
					q.add(j);
					map[i][j] = map[j][i] = false;
				}
			}
		}
		int cnt = 0;
		for (int i = 1; i <= n; i++)
			if (chk[i])
				cnt++;
		System.out.println(cnt-1);
	}
}
