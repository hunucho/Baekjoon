import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken()), K=Integer.parseInt(st.nextToken());
		int [] shared = new int [N], team = new int [N];
		Queue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++)
			shared[i] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++)
			team[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(shared);
		Arrays.sort(team);
		for(int i=0;i<N;i++) {
			int tmp=Integer.MIN_VALUE;
			for(int j=0;j<N;j++)
				tmp=Math.max(tmp, team[i]*shared[j]);
			q.add(tmp);
		}
		for(int i=0;i<K;i++)
			q.poll();
		System.out.println(q.peek());		
	}
}
