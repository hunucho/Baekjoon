package silver;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main_S3_15651 {
	static boolean checked[] = new boolean[10];
	static int n, m;
	static char[] res = new char[10];
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void f(int start, int depth) throws IOException {
		if (depth == m) {
			for (int i = 0; i < m; i++)
				bw.write(res[i]+" ");
			bw.write("\n");
			return;
		}
		for (int i = start; i <= n; i++) {
			res[depth] = (char) (i + '0');
			f(1, depth + 1);
		}
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		f(1, 0);
		bw.close();
	}
}
