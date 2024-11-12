import java.io.*;
import java.util.*;

public class Main {
	static int [][] map;
	static int [] num;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine()), M=Integer.parseInt(br.readLine());
		map = new int [N+1][N+1];
		num = new int [N+1];
		for(int i=1;i<=N;i++)
			num[i]=i;
		for(int i=1;i<=N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=1;j<=N;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j]==1)
					union(Math.min(i,j), Math.max(i, j));
			}
		}
		StringTokenizer st = new StringTokenizer(br.readLine());
		int start = find(Integer.parseInt(st.nextToken()));
		boolean ans=true;
		for(int i=0;i<M-1;i++) {
			int city = Integer.parseInt(st.nextToken());
			if(find(city)!=start)
				ans=false;
		}
		System.out.println(ans?"YES":"NO");
	}
	
	static int find (int x) {
		int ret=-1;
		if(num[x]==x)
			return x;

		ret = find(num[x]);
		num[x]=ret;
		return ret;
	}
	
	static void union (int x, int y) {
		int px = find(x);
		int py = find(y);
		if(px==py)
			return;
		num[py]=px;
	}
}
