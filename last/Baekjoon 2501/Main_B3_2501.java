package bronze;

import java.util.*;

public class Main_B3_2501 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int n=sc.nextInt(), k=sc.nextInt();
		for(int i=1;i<=n;i++)
			if(n%i==0)
				pq.add(i);
		for(int i=0;i<k-1;i++)
			pq.poll();
		System.out.println(pq.size()==0?0:pq.poll());
	}
}
