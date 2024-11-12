package gold;

import java.io.*;
import java.util.*;

public class Main_G4_1963 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		boolean [] Prime=new boolean [10001];
		for(int i=2;i<=100;i++) {
			for(int j=2;i*j<10000;j++)
				Prime[i*j]=true;
		}
		for(int t=0;t<T;t++) {
			int ans=0;
			boolean [] visited = new boolean[10001];
			StringTokenizer st = new StringTokenizer(br.readLine());
			Queue<int[]>q = new LinkedList<>();
			int a = Integer.parseInt(st.nextToken()), b= Integer.parseInt(st.nextToken());
			q.add(new int[] {a, 0});
			visited[a]=true;
			while(q.size()>0) {
				int [] temp = q.poll();
				int cur = temp[0], cnt=temp[1];
				if(cur==b) {
					ans=cnt;
					break;
				}
				for(int i=0;i<4;i++) {
					cur=temp[0];
					int tmp=(cur% (int)Math.pow(10, i+1))/(int)Math.pow(10, i);
					cur-=tmp*(int)Math.pow(10, i);
					for(int j=0;j<10;j++) {
						if(cur>=1000 && cur<10000 && !visited[cur] && !Prime[cur]) {
							q.add(new int[] {cur, cnt+1});
							visited[cur]=true;
						}
						cur+=Math.pow(10, i);						
					}
				}
			}
			if(visited[b])
				System.out.println(ans);
			else
				System.out.println("Impossible");
		}
	}
}
