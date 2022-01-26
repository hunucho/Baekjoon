package silver;

import java.util.Scanner;

public class Main_S4_1676 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		for (int i = 1; i <= n; i++) {
			int t=i;
			while (t % 5 == 0) {
				cnt++;
				t /= 5;
			}
		}
		System.out.println(cnt);
	}

}
