import java.io.*;
import java.util.*;

public class Main {	
	
	static int order = 1;
	static class Work implements Comparable<Work>{
		int priority, score, amount;
		public Work(int score, int amount) {
			this.score = score;
			this.amount = amount;
			priority = order++;
		}
		
		@Override
		public int compareTo(Main.Work o) {
			return o.priority - this.priority;
		}
		
		
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine()), ans=0;
		PriorityQueue<Work> pq = new PriorityQueue<>();
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int oper = Integer.parseInt(st.nextToken());
			if(oper==0) {
				if(pq.isEmpty())
					continue;
				Work tmp = pq.poll();
				if(tmp.amount==1)
					ans+=tmp.score;
				else {
					tmp.amount--;
					pq.add(tmp);
				}
				continue;
			}
			int A = Integer.parseInt(st.nextToken()), T=Integer.parseInt(st.nextToken())-1;
			if(T==0)
				ans+=A;
			else
				pq.add(new Work(A, T));
		}
		System.out.println(ans);
	}
}
