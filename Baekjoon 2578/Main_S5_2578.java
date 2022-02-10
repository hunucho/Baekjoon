package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_S5_2578 {

	public static boolean check(int[][] arr, int num) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++)
				if (arr[i][j] == num)
					arr[i][j] = 0;
		}
		int cnt = 0, sum = 0;
		for (int i = 0; i < 5; i++) {
			sum = 0;
			for (int j = 0; j < 5; j++)
				sum += arr[i][j];
			if (sum == 0)
				cnt++;
		}

		for (int j = 0; j < 5; j++) {
			sum = 0;
			for (int i = 0; i < 5; i++)
				sum += arr[i][j];
			if (sum == 0)
				cnt++;
		}
		sum = 0;
		for (int i = 0; i < 5; i++)
			sum += arr[i][i];
		if (sum == 0)
			cnt++;

		sum = 0;
		for (int i = 0; i < 5; i++)
			sum += arr[4 - i][i];
		if (sum == 0)
			cnt++;

		if (cnt >= 3)
			return true;
		return false;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[5][5];
		for (int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++)
				arr[i][j] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				if (check(arr, Integer.parseInt(st.nextToken()))) {
					System.out.println(i * 5 + j + 1);
					return;
				}
			}
		}
	}

}
