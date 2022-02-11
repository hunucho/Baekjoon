package silver;

import java.util.Scanner;

public class Main_S5_2635 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), max = 0, maxnum = 0;
		for (int i = n; i >= 0; i--) {
			int cnt = 2, prev = n, cur = i, next = prev - cur;
			while (prev - cur >= 0) {
				next = prev - cur;
				prev = cur;
				cur = next;
				cnt++;
			}
			if (cnt > max) {
				max = cnt;
				maxnum = i;
			}
		}
		System.out.println(max);
		int prev = n, cur = maxnum, next = prev - cur;
		System.out.print(prev + " " + cur + " ");
		while (prev - cur >= 0) {
			next = prev - cur;
			prev = cur;
			cur = next;
			System.out.print(next + " ");
		}
	}

}
