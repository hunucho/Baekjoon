import java.io.*;
import java.util.*;

class Main {
	public static class Trans implements Comparable<Trans> {
		int time, from, to;

		@Override
		public int compareTo(Main.Trans o) {
			return this.time - o.time;
		}

		public Trans(int t, int a, int b) {
			time = t;
			from = a;
			to = b;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()),
				K = Integer.parseInt(st.nextToken());
		HashSet<Integer> hs = new HashSet<>();
		Trans[] trans = new Trans[M];
		boolean[] visited = new boolean[N + 1];
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < K; i++)
			hs.add(Integer.parseInt(st.nextToken()));
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			trans[i] = new Trans(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
					Integer.parseInt(st.nextToken()));
		}
		Arrays.sort(trans);

		for (int i = 1; i <= N; i++) {
			Arrays.fill(visited, false);
			visited[i]=true;
			boolean chk = true;
			for(int j=0;j<M;j++) {
				if(visited[trans[j].from])
					visited[trans[j].to]=true;
			}
			for(int j=1;j<=N;j++) {
				if((!visited[j] && hs.contains(j)) || (visited[j] && !hs.contains(j))) {
					chk=false;
					break;
				}
			}
			if(chk) {
				System.out.println(i);
				break;
			}
		}
	}
}
