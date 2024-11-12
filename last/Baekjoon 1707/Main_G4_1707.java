import java.io.*;
import java.util.*;

class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		for(int k=0;k<K;k++) {
			boolean ans=true;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int V = Integer.parseInt(st.nextToken()), E = Integer.parseInt(st.nextToken());
			ArrayList<Integer> [] al = new ArrayList [V+1];
			int [] color = new int [V+1];
			for(int i=0;i<=V;i++)
				al[i] = new ArrayList<>();
			for(int i=0;i<E;i++) {
				st = new StringTokenizer(br.readLine());
				int from = Integer.parseInt(st.nextToken()), to = Integer.parseInt(st.nextToken());
				al[from].add(to);
				al[to].add(from);
			}
			for(int i=1;i<=V;i++) {
				if(color[i]!=0)
					continue;
				Queue<Integer> q = new LinkedList<Integer>();
				q.add(i);
				color[i]=1;
				while(q.size()>0) {
					int curVertex = q.poll(), nextColor = color[curVertex] * -1;
					for(int nextVertex : al[curVertex]) {
						if(color[nextVertex]==0) {
							color[nextVertex]=nextColor;
							q.add(nextVertex);
						}
						if(color[curVertex]==color[nextVertex])
							ans=false;
					}
				}
			}
			System.out.println(ans?"YES":"NO");
		}
	}
}


/*

1
6 5
1 2
1 3
4 5
5 6
6 4

NO



1
6 7
1 5
1 2
2 6
6 4
5 3
5 6
3 4

YES

*/
