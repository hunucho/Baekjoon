package gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_G5_14500 {
	static int max = 0, n, m;
	static int[][] arr;

	public static void f4() {
		boolean[] shape = new boolean[] { true, true, true, true };
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int sum = 0;
				for (int k = 0; k < 4; k++) {
					if (shape[k]) {
						sum += arr[i][j + k];
					}
					if (sum > max)
						max = sum;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int sum = 0;
				for (int k = 0; k < 4; k++) {
					if (shape[k]) {
						sum += arr[i + k][j];
					}
					if (sum > max)
						max = sum;
				}
			}
		}
	}

	public static void f2() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int sum = 0;
				sum = arr[i][j] + arr[i + 1][j] + arr[i][j + 1] + arr[i + 1][j + 1];
				if (sum > max)
					max = sum;
			}
		}
	}

	public static void f3() {
		boolean[][][] shape = new boolean[][][] { { { true, true, true }, { true, false, false } },
				{ { true, false, false }, { true, true, true } }, { { false, true, true }, { true, true, false } },
				{ { true, true, false }, { false, true, true } }, { { false, true, false }, { true, true, true } } };
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				for (int s = 0; s < 5; s++) {
					int sum = 0;
					for (int k = 0; k < 2; k++) {
						for (int l = 0; l < 3; l++) {
							if (shape[s][k][l])
								sum += arr[i + k][j + l];
							if (sum > max)
								max = sum;
						}
					}
					sum = 0;
					for (int k = 0; k < 2; k++) {
						for (int l = 0; l < 3; l++) {
							if (shape[s][1 - k][2 - l]) {
								sum += arr[i + k][j + l];
								if (sum > max)
									max = sum;
							}
						}
					}
				}
			}
		}

		for (int i = 0; i < n ; i++) {
			for (int j = 0; j < m; j++) {
				for (int s = 0; s < 5; s++) {
					int sum = 0;
					for (int k = 0; k < 2; k++) {
						for (int l = 0; l < 3; l++) {
							if (shape[s][k][l])
								sum += arr[i + l][j + k];
							if (sum > max)
								max = sum;
						}
					}
					sum = 0;
					for (int k = 0; k < 2; k++) {
						for (int l = 0; l < 3; l++) {
							if (shape[s][1 - k][2 - l]) {
								sum += arr[i + l][j + k];
								if (sum > max)
									max = sum;
							}
						}
					}
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[505][505];
		for (int i = 0; i < n; i++) { // input
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++)
				arr[i][j] = Integer.parseInt(st.nextToken());
		}
		f2();
		f3();
		f4();
		System.out.println(max);
	}
}