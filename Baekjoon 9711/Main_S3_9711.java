import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();
		long[] fibo = new long[10005];
		for (int t = 1; t <= T; t++) {
			int P = sc.nextInt(), Q = sc.nextInt();
			fibo[1] = fibo[2] = 1;
			for (int i = 3; i <= P; i++)
				fibo[i] = fibo[i - 1] % Q + fibo[i - 2] % Q;
			sb.append("Case #" + t + ": " + fibo[P] % Q + "\n");
		}
		System.out.println(sb.toString());
	}
}
