package silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main_S2_1260 {
	static boolean[][] map;
	static int n, m;

	public static void bfs(int v) {
		boolean[] checked = new boolean[n];
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(v);
		checked[v] = true;
		while (q.size() > 0) {
			int i = q.poll();
			System.out.print(i + " ");
			for (int j = 1; j < n; j++) {
				if (map[i][j] && !checked[j]) {
					q.add(j);
					checked[j] = true;
				}
			}
		}
	}

	static boolean[] checked;

	public static void dfs(int v) {
		if (!checked[v]) {
			System.out.print(v + " ");
			checked[v]=true;
			for (int i = 1; i < n; i++)
				if (map[v][i] && !checked[i])
					dfs(i);
		}
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt() + 1;
		m = sc.nextInt();
		int v = sc.nextInt();
		map = new boolean[n][n];
		for (int i = 0; i < m; i++) {
			int s = sc.nextInt(), e = sc.nextInt();
			map[s][e] = map[e][s] = true;
		}
		checked = new boolean[n];
		dfs(v);
		System.out.println();
		bfs(v);
	}
}
