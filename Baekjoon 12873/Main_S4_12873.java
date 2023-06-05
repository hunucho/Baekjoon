package silver;

import java.util.*;

public class Main_S4_12873 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i=1;i<=N;i++)
			q.add(i);
		for(int i=1;i<N;i++) {
			long time=(long)(Math.pow(i, 3)-1)%(q.size());
			for(int j=0;j<time;j++)
				q.add(q.poll());
			q.poll();
		}
		System.out.println(q.poll());
	}
}
