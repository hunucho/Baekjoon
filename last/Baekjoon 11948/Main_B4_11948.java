package bronze;

import java.util.*;

public class Main_B4_11948 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0, min = 100;
		for (int i = 0; i < 4; i++) {
			int t = sc.nextInt();
			ans += t;
			min = Math.min(min, t);
		}
		ans -= min;
		int x = sc.nextInt(), y = sc.nextInt();
		System.out.println(ans+Math.max(x, y));

	}
}
