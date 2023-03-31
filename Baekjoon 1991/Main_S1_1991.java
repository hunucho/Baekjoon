package silver;

import java.util.*;

public class Main_S1_1991 {
	static int N;
	static char[][] arr = new char[26][2];
	static boolean[] chk = new boolean[26];
	static String pre = "", in = "", post = "";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int tmp=sc.next().charAt(0)-'A';
			arr[tmp][0]=sc.next().charAt(0);
			arr[tmp][1]=sc.next().charAt(0);
		}
		f(0);
		System.out.println(pre + "\n" + in + "\n" + post);
	}

	public static void f(int i) {
		if (!chk[i]) {
			chk[i] = true;
			pre += (char)('A'+i);
			for (int j = 0; j < 2; j++) {
				if (j == 1)
					in += (char)('A'+i);
				if (arr[i][j] != '.')
					f(arr[i][j] - 'A');
			}
			post += (char)('A'+i);
		}
		return;
	}
}
