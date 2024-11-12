package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_S2_18111 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n, m, b, time = Integer.MAX_VALUE, height = 0;
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		int[][] map = new int[n][m];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++)
				map[i][j] = Integer.parseInt(st.nextToken());
		}

		// 전체 높이를 탐색
		for (int h = 0; h < 256; h++) {
			int tempb = b, temptime = 0;
			// 높이를 탐색할때 h일때의 가능한 모든 범위를 검색
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (temptime < 0)
						break;
					if (map[i][j] > h) {
						temptime += (map[i][j] - h) * 2;
						tempb+=map[i][j]-h;
					}
					else if (map[i][j] < h) {
						temptime += (h - map[i][j]);
						tempb -= (h - map[i][j]);
					}					
				}				
			}
			if (temptime <= time && tempb>=0) {
				time = temptime;
				height = h;
			}
		}
		System.out.println(time + " " + height);
	}
}
