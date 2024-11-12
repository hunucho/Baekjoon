import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(), M=sc.nextInt(), L=sc.nextInt();
		PriorityQueue<Integer> pqori = new PriorityQueue<>();
		for(int i=0;i<N;i++)
			pqori.add(sc.nextInt());
		int l=0, r=L;
		while(l<r) {
			PriorityQueue<Integer> pq = new PriorityQueue<>(pqori);
			int m=(l+r)/2, cnt=0, cur=0;
			if(m==0) {
				l++;
				m++;
			}
			while(pq.size()>0 || cur+m<L) {
				if(pq.size()>0 && cur+m>=pq.peek()) {
					cur=pq.poll();
				} else {
					cnt++;
					pq.add(cur+m);
				}
			}
			if(cnt<=M)
				r=m;
			else
				l=m+1;
		}
		System.out.println(r);
	}	
}


/*

1 98 100
1



*/
