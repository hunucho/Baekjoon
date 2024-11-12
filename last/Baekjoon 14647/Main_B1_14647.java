package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_B1_14647 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n + 1][m + 1];
		int maxn = 0, maxm = 0, maxi = 0, maxj = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				int cnt = 0, tmp = Integer.parseInt(st.nextToken());
				while (tmp > 0) {
					if (tmp % 10 == 9)
						cnt++;
					tmp /= 10;
				}
				arr[i][j] = cnt;
				arr[i][m] += cnt;
				arr[n][j] += cnt;
				if (maxn < arr[i][m]) {
					maxi = i;
					maxn = arr[i][m];
				}
				if (maxm < arr[n][j]) {
					maxj = j;
					maxm = arr[n][j];
				}
			}
		}
		int sum = 0;
		if (maxn > maxm)
			for (int i = 0; i < n; i++) {
				if (i == maxi)
					continue;
				sum += arr[i][m];
			}
		else
			for (int j = 0; j < m; j++) {
				if (j == maxj)
					continue;
				sum += arr[n][j];
			}
		System.out.println(sum);

	}

}
