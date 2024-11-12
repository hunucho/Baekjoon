package gold;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_G4_13913 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		Queue<int[]> q = new LinkedList<int[]>();
		Queue<String> p = new LinkedList<String>();
		q.add(new int[] { n, 1 });
		p.add(String.valueOf(n));
		int[] cur = { 0, k };
		boolean[] chk = new boolean[200010];
		chk[n] = true;
		String str = "";
		if (n >= k) {
			StringBuilder sb = new StringBuilder();
			for (int i = n; i >= k; i--)
				sb.append(i + " ");
			System.out.println(n - k);
			System.out.println(sb.toString());
		} else {
			while (q.size() > 0) {
				if (chk[k])
					break;
				cur = q.poll();
				str = p.poll();

				if (cur[0] < 0 || cur[0] > 200001)
					continue;
				if (cur[0] - 1 >= 0 && cur[0] - 1 <= 200000 && !chk[cur[0] - 1]) {
					chk[cur[0] - 1] = true;
					q.add(new int[] { cur[0] - 1, cur[1] + 1 });
					p.add(str + " " + String.valueOf(cur[0] - 1));
				}
				if (cur[0] * 2 >= 0 && cur[0] * 2 <= 100000 && !chk[cur[0] * 2]) {
					chk[cur[0] * 2] = true;
					q.add(new int[] { cur[0] * 2, cur[1] + 1 });
					p.add(str + " " + String.valueOf(cur[0] * 2));
				}
				if (cur[0] + 1 >= 0 && cur[0] + 1 <= 100000 && !chk[cur[0] + 1]) {
					chk[cur[0] + 1] = true;
					q.add(new int[] { cur[0] + 1, cur[1] + 1 });
					p.add(str + " " + String.valueOf(cur[0] + 1));
				}

				if (chk[k]) {
					str += " ";
					break;
				}

			}
			System.out.println(cur[1]);
			System.out.println(str + k);
		}
	}
}
