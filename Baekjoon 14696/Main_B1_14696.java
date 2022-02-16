package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_B1_14696 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		for (int i = 0; i < n; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int[] a = new int[5];
			int k = Integer.parseInt(st1.nextToken());
			for (int j = 0; j < k; j++)
				a[Integer.parseInt(st1.nextToken())]++;
			int[] b = new int[5];
			k = Integer.parseInt(st2.nextToken());
			for (int j = 0; j < k; j++)
				b[Integer.parseInt(st2.nextToken())]++;
			for (int j = 4; j >= 1; j--) {
				if (a[j] > b[j]) {
					System.out.println("A");
					break;
				} else if (a[j] < b[j]) {
					System.out.println("B");
					break;
				}
				if (a[j] - b[j] == 0 && j == 1)
					System.out.println("D");
			}
		}
	}
}