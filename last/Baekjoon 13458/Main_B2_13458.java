package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_B2_13458 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] rooms = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			rooms[i] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
		long cnt = 0;
		for (int i = 0; i < n; i++) {
			cnt++;
			rooms[i] -= b;
			if (rooms[i] > 0) {
				cnt += (rooms[i]) / c;
				if (rooms[i] % c > 0)
					cnt++;
			}
		}
		System.out.println(cnt);
	}
}
