package silver;

import java.util.*;

public class Main_S2_5464 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(), M=sc.nextInt(), ans=0;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		Queue<Integer> q = new LinkedList<Integer>();
		int [] prices = new int [N+1], weight = new int [M+1], loc = new int [M+1];
		for(int i=1;i<=N;i++) {
			prices[i]=sc.nextInt();
			pq.add(i);
		}
		for(int i=1;i<=M;i++)
			weight[i]=sc.nextInt();
		for(int i=0;i<M*2;i++) {
			int move=sc.nextInt();
			if(move>0) {
				if(pq.size()==0) 
					q.add(move);
				else {
					int tmp=pq.poll();
					ans+=prices[tmp]*weight[move];
					loc[move]=tmp;
				}
			}
			else {
				if(q.size()>0) {
					int tmp=q.poll();
					loc[tmp]=loc[-1*move];
					ans+=prices[loc[tmp]]*weight[tmp];
				}
				else
					pq.add(loc[-1*move]);
			}				
		}
		System.out.println(ans);
	}
}
