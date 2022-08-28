
import java.util.*;
import java.io.*;

public class Main_S1_2583 {
	static int m, n, k;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Queue<Integer> ans = new PriorityQueue<>();
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		k=Integer.parseInt(st.nextToken());
		boolean [][] map = new boolean[m][n];
		for(int t=0;t<k;t++) {
			st = new StringTokenizer(br.readLine());
			int sx=Integer.parseInt(st.nextToken()), sy=Integer.parseInt(st.nextToken());
			int ex=Integer.parseInt(st.nextToken()), ey=Integer.parseInt(st.nextToken());
			for(int i=sx;i<ex;i++)
				for(int j=sy;j<ey;j++)
					map[i][j]=true;
		}
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				if(!map[i][j])
					ans.add(bfs(i,j, map));
		System.out.println(ans.size());
		while(ans.size()>0)
			System.out.print(ans.poll()+" ");
	}
	
	public static int bfs(int cx,int cy, boolean [][] map) {
		int [] dx = {-1,1,0,0}, dy= {0,0,1,-1};
		Queue<int []>q = new LinkedList<int[]>();
		q.add(new int[] {cx,cy});
		int cnt=1;
		map[cx][cy]=true;
		while(q.size()>0){
			int [] cur = q.poll();
			int x=cur[0], y=cur[1];
			for(int i=0;i<4;i++) {
				int nx=dx[i]+x, ny=dy[i]+y;
				if(nx>=0 && nx<m && ny>=0 && ny<n && !map[nx][ny]) {
					q.add(new int[] {nx, ny});
					map[nx][ny]=true;
					cnt++;
				}
			}
		}
		return cnt;
	}
}
