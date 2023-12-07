import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=0;t<T;t++) {
			PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
			int J=sc.nextInt(), N=sc.nextInt(), ans=0;
			for(int i=0;i<N;i++)
				pq.add(sc.nextInt()*sc.nextInt());
			while(J>0) {
				J-=pq.poll();
				ans++;
			}
			System.out.println(ans);
		}
	}	
}
