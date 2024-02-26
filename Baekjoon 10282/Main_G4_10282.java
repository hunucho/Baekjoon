import java.io.*;
import java.util.*;

public class Main {

	public static class Dependency implements Comparable<Dependency> {
		int to, time;

		public Dependency(int to, int time) {
			this.to = to;
			this.time = time;
		}

		@Override
		public int compareTo(Main.Dependency o) {
			return time - o.time;
		}
	}
	
	static ArrayList<Dependency> [] al;
	static int [] infected, time;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken()),
					c = Integer.parseInt(st.nextToken());
			infected = new int [n+1];
			time = new int [n+1];
			Arrays.fill(time, Integer.MAX_VALUE);
			al = new ArrayList [n + 1];
			for (int i = 0; i <= n; i++)
				al[i] = new ArrayList<>();
			
			for (int i = 0; i < d; i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()),
						s = Integer.parseInt(st.nextToken());
				al[b].add(new Dependency(a, s));
			}
			
			dijkstra(c);
			int cnt=0, max=0;
			for(int i=1;i<=n;i++)
				if(infected[i]!=0) {
					cnt++;
					max=Math.max(max, time[i]);
				}
			System.out.println(cnt+" "+max);
		}
	}

	public static void dijkstra(int start) {
		PriorityQueue<Dependency> pq = new PriorityQueue<>();
		time[start]=0;
		pq.add(new Dependency(start, 0));
		while(pq.size()>0) {
			Dependency cur = pq.poll();
			if(infected[cur.to]==1)
				continue;
			else
				infected[cur.to]=1;
			for(Dependency next:al[cur.to]) {
				if(time[cur.to]+next.time<time[next.to]) {
					time[next.to]= time[cur.to]+next.time; 
					pq.add(new Dependency(next.to, time[next.to]));
				}
			}
		}
	}
}
