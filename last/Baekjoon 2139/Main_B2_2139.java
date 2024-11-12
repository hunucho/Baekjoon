import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 };
		while (true) {
			int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
			if (A == 0 && B == 0 && C == 0)
				break;
			int tmp = 0;
			if (C % 4 == 0 && (C % 100 != 0 || C % 400 == 0))
				tmp = 1;

			int ans = 0;
			if (tmp == 1 && B > 2)
				++ans;

			for (int i = 0; i < B; ++i)
				ans += arr[i];

			ans += A;

			System.out.println(ans);
		}
	}
}
