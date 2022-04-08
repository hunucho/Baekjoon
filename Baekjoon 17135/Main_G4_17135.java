package gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_G4_17135 {
	static int n, m, d, ans;
	static boolean[] archors;
	static int[][] ori, work;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		d = Integer.parseInt(st.nextToken());
		ori = new int[n+1][m+1];
		work = new int[n+1][m+1];
		archors = new boolean[m];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++)
				ori[i][j] = Integer.parseInt(st.nextToken());
		}

		combi(0, 0);

		System.out.println(ans);

	}

	public static void copymap() {
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				work[i][j] = ori[i][j];
	}

	public static void combi(int s, int depth) {
		if (depth == 3) {
			copymap(); // ori -> work로 맵복사
			simul(); // work 사용
			return;
		}
		for (int i = s; i < m; i++) {
			if (!archors[i]) {
				archors[i] = true;
				combi(i, depth + 1);
				archors[i] = false;
			}
		}
	}

	public static void simul() {
		int tempsum = 0;
		for (int time = 0; time < n; time++) {
			int[][] kill = new int[3][2];
			for(int i=0;i<3;i++)
				kill[i][0]=n;
			int loc = 0;
			for (int archor = 0; archor < m; archor++) {
				if (archors[archor]) {

					int mindist = 9999;
					for (int j = 0; j < m; j++) {
						for (int i = n - time - 1; i >= 0; i--) {
							int tempdist = Math.abs(n - time - i) + Math.abs(archor - j);
							if (work[i][j] == 1 && tempdist <= d && tempdist < mindist) {
								mindist = tempdist;
								kill[loc][0] = i;
								kill[loc][1] = j;
							}
						}
					}
					loc++;
				}
			}
			for (int i = 0; i < 3; i++) {
				if (work[kill[i][0]][kill[i][1]] == 1) {
					work[kill[i][0]][kill[i][1]] = 0;
					tempsum++;
				}
			}
		}
		if (tempsum > ans)
			ans = tempsum;
	}

}
