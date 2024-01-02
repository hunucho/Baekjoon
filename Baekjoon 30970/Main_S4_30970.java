import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		Miniature[] C = new Miniature[N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			C[i] = new Miniature(a, b);
		}
		Arrays.sort(C, new Comparator<Miniature>() {
			@Override
			public int compare(Main.Miniature o1, Main.Miniature o2) {
				if (o1.Q == o2.Q)
					return o1.P - o2.P;
				return o2.Q - o1.Q;
			}
		});
		System.out.printf("%d %d %d %d\n",C[0].Q, C[0].P ,C[1].Q, C[1].P);

		Arrays.sort(C, new Comparator<Miniature>() {
			@Override
			public int compare(Main.Miniature o1, Main.Miniature o2) {
				if (o1.P == o2.P)
					return o2.Q - o1.Q;
				return o1.P - o2.P;
			}
		});
		System.out.printf("%d %d %d %d",C[0].Q, C[0].P ,C[1].Q, C[1].P);

	}

	public static class Miniature {
		public int Q;
		public int P;

		public Miniature(int Q, int P) {
			this.Q = Q;
			this.P = P;
		}
	}
}
