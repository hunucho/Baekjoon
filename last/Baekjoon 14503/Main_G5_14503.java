package gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_G5_14503 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), dir = 0, cnt = 0;

		int[] robot = new int[3], dx = { 0, 1, 0, -1 }, dy = { -1, 0, 1, 0 };
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 3; i++)
			robot[i] = Integer.parseInt(st.nextToken());
		dir=3-robot[2];
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++)
				arr[i][j] = Integer.parseInt(st.nextToken());
		}
		boolean chk_while=true;
		while (chk_while) {
			if (arr[robot[0]][robot[1]] == 0) {
				arr[robot[0]][robot[1]] = 2;
				cnt++;
			}
			for (int i = 1; i < 5; i++) {
				dir = (dir + 1) % 4;
				if (robot[0] + dx[dir] >= 0 && robot[0] + dx[dir] < n && robot[1] + dy[dir] >= 0 && robot[1] + dy[dir] < m) {
					if(arr[robot[0]+dx[dir]][robot[1]+dy[dir]]==0) {
						robot[0] += dx[dir];
						robot[1] += dy[dir];
						break;
					}
				}
				if(i==4) {
					if(!(robot[0] - dx[dir] >= 0 && robot[0] - dx[dir] < n && robot[1] - dy[dir] >= 0 && robot[1] - dy[dir] < m) || arr[robot[0]-dx[dir]][robot[1]-dy[dir]]==1)
						chk_while=false;
					else {
						robot[0]-=dx[dir];
						robot[1]-=dy[dir];
					}
				}
			}
		}
		System.out.println(cnt);
	}
}
