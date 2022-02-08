package silver;

import java.util.Scanner;

public class Main_S3_15652 {
	static boolean checked[] = new boolean[10];
	static int n, m;
	static char[] res = new char[10];

	public static void f(int start, int depth) {
		if (depth == m) {
			for (int i = 0; i < m; i++)
				System.out.print(res[i] + " ");
			System.out.println();
			return;
		}
		for (int i = start; i <= n; i++) {
			res[depth] = (char) (i + '0');
			f(i, depth + 1);
		}
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		f(1, 0);
	}
}
