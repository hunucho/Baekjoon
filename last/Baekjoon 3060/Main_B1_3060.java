import java.io.*;
import java.util.*;

public class Main_B1_3060 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[][] pig = new int[2][6];
		for (int t = 0; t < T; t++) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 6; i++)
				pig[0][i] = pig[1][i] = Integer.parseInt(st.nextToken());
			int sum = 0, cnt = 0;
			while (sum <= n) {
				sum = 0;
				for (int i = 0; i < 6; i++)
					sum += pig[0][i];
				for (int i = 0; i < 6; i++)
					pig[1][i] += pig[0][(i + 1) % 6] + pig[0][5 - i] + pig[0][(i + 3) % 6];
				for (int i = 0; i < 6; i++)
					pig[0][i] = pig[1][i];

				cnt++;
			}
			System.out.println(cnt);
		}
	}
}
