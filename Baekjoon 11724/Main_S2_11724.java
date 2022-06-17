package silver;

import java.io.*;
import java.util.*;

public class Main_S2_11724 {
	static boolean [][] graph;
	static boolean [] chk;
	static int n;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken()), ans=0;
		chk = new boolean [n+1];
		graph = new boolean [n+1][n+1];
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken()), b=Integer.parseInt(st.nextToken());
			graph[a][b]=graph[b][a]=true;
		}
		for(int i=1;i<=n;i++) {
			if(!chk[i]) {
				ans++;
				BFS(i);
			}
		}
		System.out.println(ans);
	}
	static void BFS(int s) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(s);
		while(q.size()>0) {
			int cur=q.poll();
			for(int i=1;i<=n;i++) {
				if(!chk[i] && graph[cur][i])
				{
					chk[i]=true;
					q.add(i);
				}
			}
		}
	}
}
