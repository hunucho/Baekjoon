package silver;

import java.util.Scanner;

public class Main_S1_1074 {
	static int cnt = 0;
	boolean chk = false;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), r = sc.nextInt(), c = sc.nextInt();
		z(n, 0, 0, r, c);
	}

	public static void z(int n, int x, int y, int r, int c) {
		if (x == r && y == c) {
			System.out.println(cnt);
			return;
		}
		if (n == 0)
			cnt++;
		else if (!(x <= r && r < x + (int) Math.pow(2, n) && y <= c && c < y + (int) Math.pow(2, n))) {
			cnt += (int) Math.pow(2, n) *  Math.pow(2, n);
			return;
		} else {
			z(n - 1, x, y, r, c);
			z(n - 1, x, (int) Math.pow(2, n - 1) + y, r, c);
			z(n - 1, (int) Math.pow(2, n - 1) + x, y, r, c);
			z(n - 1, (int) Math.pow(2, n - 1) + x, (int) Math.pow(2, n - 1) + y, r, c);
		}
	}
}