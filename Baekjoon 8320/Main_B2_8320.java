package bronze;

import java.util.Scanner;

public class Main_B2_8320 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), cnt = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i*j <=n)
					cnt++;
			}
		}
		System.out.println(cnt);
	}
}
