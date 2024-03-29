package gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_G2_1103 {
	static int n, m;
	static int[][] arr, chk;

	public static void dfs(int x, int y, int z) {
		if (chk[x][y] == 0 || chk[x][y]<z) {
			if (z >= n * m+5)
				return;
			chk[x][y] = z;
			if (x + arr[x][y] <= n)
				if (arr[x + arr[x][y]][y] > 0)
					dfs(x + arr[x][y], y, chk[x][y] + 1);
			if (x - arr[x][y] >= 1)
				if (arr[x - arr[x][y]][y] > 0)
					dfs(x - arr[x][y], y, chk[x][y] + 1);
			if (y + arr[x][y] <= m)
				if (arr[x][y + arr[x][y]] > 0)
					dfs(x, y + arr[x][y], chk[x][y] + 1);
			if (y - arr[x][y] >= 1)
				if (arr[x][y - arr[x][y]] > 0)
					dfs(x, y - arr[x][y], chk[x][y] + 1);
		} else
			z += chk[x][y];
		

	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n + 2][m + 2];
		chk = new int[n + 2][m + 2];

		for (int i = 1; i <= n; i++) {
			String str = br.readLine();
			for (int j = 1; j <= m; j++) {
				if (str.charAt(j - 1) == 'H')
					arr[i][j] = -1;
				else
					arr[i][j] = str.charAt(j - 1) - '0';
			}
		}
		dfs(1, 1, 1);

		int maxcnt = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (chk[i][j] > maxcnt)
					maxcnt = chk[i][j];
				if (chk[i][j] >=n*m+2) {
					System.out.println(-1);
					return;
				}
			}
		}
		System.out.println(maxcnt);
	}
}


/*
 * 24 24
12H12H12H12H12H12H12H12H
2HH2HH2HH2HH2HH2HH2HH2HH
HHHHHHHHHHHHHHHHHHHHHHHH
12H12H12H12H12H12H12H12H
2HH2HH2HH2HH2HH2HH2HH2HH
HHHHHHHHHHHHHHHHHHHHHHHH
12H12H12H12H12H12H12H12H
2HH2HH2HH2HH2HH2HH2HH2HH
HHHHHHHHHHHHHHHHHHHHHHHH
12H12H12H12H12H12H12H12H
2HH2HH2HH2HH2HH2HH2HH2HH
HHHHHHHHHHHHHHHHHHHHHHHH
12H12H12H12H12H12H12H12H
2HH2HH2HH2HH2HH2HH2HH2HH
HHHHHHHHHHHHHHHHHHHHHHHH
12H12H12H12H12H12H12H12H
2HH2HH2HH2HH2HH2HH2HH2HH
HHHHHHHHHHHHHHHHHHHHHHHH
12H12H12H12H12H12H12H12H
2HH2HH2HH2HH2HH2HH2HH2HH
HHHHHHHHHHHHHHHHHHHHHHHH
12H12H12H12H12H12H12H12H
2HH2HH2HH2HH2HH2HH2HH2HH
HHHHHHHHHHHHHHHHHHHHHHHH
30


6 7
12HHHHH
2214HHH
H1HHHHH
H4H9H2H
HHHHHHH
HHH2HHH
Ans: 7

4 4
3HH2
H1HH
H2H1
2219

답 : 8


50 50
12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12
2H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H
H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H1
12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12
2H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H
H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H1
12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12
2H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H
H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H1
12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12
2H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H
H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H1
12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12
2H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H
H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H1
12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12
2H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H
H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H1
12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12
2H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H
H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H1
12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12
2H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H
H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H1
12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12
2H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H
H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H1
12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12
2H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H
H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H1
12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12
2H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H
H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H1
12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12
2H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H
H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H1
12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12
2H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H
H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H1
12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12
2H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H
H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H1
12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12
2H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H
H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H1
12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12
2H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H
H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H1
12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12
2H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H12H
66
 */




