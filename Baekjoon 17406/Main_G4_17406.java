package gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_G4_17406 {
	static int[][] arr, locations, permutation;
	static int n, m, k, cnt;
	static boolean[] isChecked;
	static StringBuilder sb;

	public static void rotate(int[][] brr, int r, int c, int s) {
		while (s > 0) {
			int save = brr[r - s][c - s];
			for (int i = r - s; i < r + s; i++) // left side
				brr[i][c - s] = brr[i + 1][c - s];
			for (int j = c - s; j < c + s; j++) // bottom side
				brr[r + s][j] = brr[r + s][j + 1];
			for (int i = r + s - 1; i >= r - s; i--) // right side
				brr[i + 1][c + s] = brr[i][c + s];
			for (int j = c + s - 1; j >= c - s; j--) // top side
				brr[r - s][j + 1] = brr[r - s][j];

			brr[r - s][c + 1 - s] = save;
			s--;
		}
	}
static int[] res = new int[10];
	public static void permutation(int depth) {
		if (depth == k) {
			for(int i=0;i<k;i++)
				permutation[cnt][i]=res[i];
			cnt++;
			return;
		}

		for (int i = 0; i < k; i++) {
			if (!isChecked[i]) {
				isChecked[i] = true;
				res[depth]=i;
				permutation(depth + 1);
				isChecked[i] = false;
			}
		}
	}

	public static int func() {
		int min=Integer.MAX_VALUE;
		int[][] brr = new int[n + 2][m + 2];

		for (int rot = 0; rot < permutation.length; rot++) {
			for (int i = 1; i <= n; i++) // Array Initialization
				for (int j = 1; j <= m; j++)
					brr[i][j] = arr[i][j];

			for (int l = 0; l < permutation[rot].length; l++)
				rotate(brr, locations[permutation[rot][l]][0], locations[permutation[rot][l]][1],
						locations[permutation[rot][l]][2]);
			for (int i = 1; i <= n; i++) {
				int temp = 0;
				for (int j = 1; j <= m; j++) {
					temp += brr[i][j];
//					System.out.print(brr[i][j]+" ");
				}
//				System.out.println("");
				if (temp < min)
					min = temp;
			}
		}
		return min;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		arr = new int[n + 2][m + 2];
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= m; j++)
				arr[i][j] = Integer.parseInt(st.nextToken());
		}

		locations = new int[k + 2][3];
		isChecked = new boolean[k + 2];
		int per_size = 1;
		for (int i = 1; i <= k; i++)
			per_size *= i;
		permutation = new int[per_size][k];
		for (int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			locations[i][0] = Integer.parseInt(st.nextToken());
			locations[i][1] = Integer.parseInt(st.nextToken());
			locations[i][2] = Integer.parseInt(st.nextToken());
		}
		permutation(0);
		System.out.println(func());
	}
}
