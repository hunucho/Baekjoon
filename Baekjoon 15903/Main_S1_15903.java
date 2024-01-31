import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m=sc.nextInt();
		long ans=0;
		PriorityQueue<Long> pq = new PriorityQueue<>();
		for(int i=0;i<n;i++)
			pq.add(sc.nextLong());
		for(int i=0;i<m;i++) {
			long x=pq.poll(), y=pq.poll();
			pq.add(x+y);
			pq.add(x+y);
		}
		for(int i=0;i<n;i++)
			ans+=pq.poll();
		System.out.println(ans);
	}
}
