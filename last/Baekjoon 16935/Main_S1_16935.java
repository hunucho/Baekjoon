package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main_S1_16935 {

	static int[][] arr;
	static int n, m, r;

	public static void f1() {
		int[][] brr = new int[n][m];
		for (int i = 0; i < n; i++)
			brr[n - i - 1] = arr[i];
		arr = brr;
	}

	public static void f2() {
		int[][] brr = new int[n][m];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				brr[i][j] = arr[i][m - j - 1];
		arr = brr;
	}

	public static void f3() {
		int[][] brr = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++)
				brr[i][j] = arr[n - j - 1][i];
		}
		int temp = n;
		n = m;
		m = temp;
		arr = brr;
	}

	public static void f4() {
		int[][] brr = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++)
				brr[i][j] = arr[j][m - i - 1];
		}
		int temp = n;
		n = m;
		m = temp;
		arr = brr;
	}

	public static void f5() {
		int[][] brr = new int[n][m];
		for (int i = 0; i < n / 2; i++) // 1번
			for (int j = 0; j < m / 2; j++)
				brr[i][j] = arr[i + n / 2][j];

		for (int i = 0; i < n / 2; i++) // 2번
			for (int j = m / 2; j < m; j++)
				brr[i][j] = arr[i][j - m / 2];

		for (int i = n / 2; i < n; i++) // 3번
			for (int j = m / 2; j < m; j++)
				brr[i][j] = arr[i - n / 2][j];

		for (int i = n / 2; i < n; i++) // 4번
			for (int j = 0; j < m / 2; j++)
				brr[i][j] = arr[i][j + m / 2];
		arr = brr;
	}

	public static void f6() {
		int[][] brr = new int[n][m];
		for (int i = 0; i < n / 2; i++) // 1번
			for (int j = 0; j < m / 2; j++)
				brr[i][j] = arr[i][j + m / 2];

		for (int i = 0; i < n / 2; i++) // 2번
			for (int j = m / 2; j < m; j++)
				brr[i][j] = arr[i + n / 2][j];

		for (int i = n / 2; i < n; i++) // 3번
			for (int j = m / 2; j < m; j++)
				brr[i][j] = arr[i][j - m / 2];

		for (int i = n / 2; i < n; i++) // 4번
			for (int j = 0; j < m / 2; j++)
				brr[i][j] = arr[i - n / 2][j];
		arr = brr;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++)
				arr[i][j] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < r; i++) {
			int sw = Integer.parseInt(st.nextToken());
			switch (sw) {
			case 1:
				f1();
				break;
			case 2:
				f2();
				break;
			case 3:
				f3();
				break;
			case 4:
				f4();
				break;
			case 5:

				f5();
				break;
			case 6:
				f6();
				break;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				bw.write(arr[i][j] + " ");
			bw.write("\n");
		}
		bw.close();
	}
}
