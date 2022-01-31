package silver;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main_S1_2247 {
	public static boolean[][] arr = new boolean[10000][10000];

	public static void f(int n, int ix, int jx) {
		if (n == 1) {
			arr[ix][jx] = true;
			return;
		} else {
			for (int i = 0; i < 3; i++)
				for (int j = 0; j < 3; j++)
					if(!(i==1 && j==1))
						f(n / 3, ix + i * (n / 3), jx + j * (n / 3));
		}

	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = sc.nextInt();
		f(n, 0, 0);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				if(arr[i][j])
					bw.write('*');
				else
					bw.write(' ');
			bw.write('\n');
		}
		bw.close();
	}
}