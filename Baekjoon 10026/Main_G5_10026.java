package gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main_G5_10026 {
	public static void search1(char map[][], boolean chk[][], int x, int y, int n) {
		Queue<Integer> q = new LinkedList<Integer>();
		int [] dx = new int[] {-1, 0, 1, 0}, dy = new int[] {0, -1, 0, 1};
		q.add(x);
		q.add(y);
		char loc=map[x][y];
		while (q.size() > 0) {
			x=q.poll();
			y=q.poll();
			chk[x][y]=true;
			for (int k = 0; k < 4; k++) {
				if (x + dx[k] > 0 && x + dx[k] <= n && y + dy[k] > 0 && y + dy[k] <= n) {
					if (map[x + dx[k]][y + dy[k]] == loc && !chk[x + dx[k]][y + dy[k]]) {
						chk[x + dx[k]][y + dy[k]] = true;
						q.add(x+dx[k]);
						q.add(y+dy[k]);
					}
				}
			}
		}
	}
	
	public static void search2(boolean map[][], boolean chk[][], int x, int y, int n) {
		Queue<Integer> q = new LinkedList<Integer>();
		int [] dx = new int[] {-1, 0, 1, 0}, dy = new int[] {0, -1, 0, 1};
		q.add(x);
		q.add(y);
		boolean loc=map[x][y];
		while (q.size() > 0) {
			x=q.poll();
			y=q.poll();
			chk[x][y]=true;
			for (int k = 0; k < 4; k++) {
				if (x + dx[k] > 0 && x + dx[k] <= n && y + dy[k] > 0 && y + dy[k] <= n) {
					if (map[x + dx[k]][y + dy[k]] == loc && !chk[x + dx[k]][y + dy[k]]) {
						chk[x + dx[k]][y + dy[k]] = true;
						q.add(x+dx[k]);
						q.add(y+dy[k]);
					}
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		char[][] map1 = new char[n + 2][n + 2];
		boolean[][] map2 = new boolean[n + 2][n + 2], chk1 = new boolean[n + 2][n + 2],
				chk2 = new boolean[n + 2][n + 2];
		for (int i = 1; i <= n; i++) {
			String str = br.readLine();
			for (int j = 0; j < n; j++) {
				map1[i][j + 1] = str.charAt(j);
				if (str.charAt(j) == 'B')
					map2[i][j + 1] = true;
			}
		}
		int cnt1 = 0, cnt2 = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (!chk1[i][j]) {
					search1(map1, chk1, i, j, n);
					cnt1++;
				}
			}
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (!chk2[i][j]) {
					search2(map2, chk2, i, j, n);
					cnt2++;
				}
			}
		}
		
		System.out.println(cnt1+" "+cnt2);
	}
}
