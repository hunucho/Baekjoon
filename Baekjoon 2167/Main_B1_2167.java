package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_B1_2167 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n][m];
		int[] brr = new int[n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				brr[i] += arr[i][j];
			}
		}
		int k = Integer.parseInt(br.readLine());
		for (int t = 0; t < k; t++) {
			int sum = 0;
			st = new StringTokenizer(br.readLine());
			int si, sj, ei, ej;
			si = Integer.parseInt(st.nextToken());
			sj = Integer.parseInt(st.nextToken());
			ei = Integer.parseInt(st.nextToken());
			ej = Integer.parseInt(st.nextToken());
			for (int i = si - 1; i < ei; i++)
				sum += brr[i];					// 전체 행의 값 구하기
			
			for (int i = si-1; i < ei; i++)		// 왼쪽에 안쓰는 값 빼기
				for (int j = 0; j < sj-1; j++)
					sum -= arr[i][j];
			for (int i = si-1; i < ei; i++)		// 오른쪽에 안쓰는 값 빼기
				for (int j = ej; j < m; j++)
					sum -= arr[i][j];
			System.out.println(sum);

		}
	}

}
