package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_S1_1926 {
	static int max_area,cnt_works, n, m;
	public static void bfs(boolean[][]map, int x, int y) {
		cnt_works++;
		int cnt=1;
		int[] dx = new int[] {0,0,1,-1}, dy = new int[] {1,-1,0,0};
		Queue<Integer> qx = new LinkedList<Integer>(), qy = new LinkedList<Integer>();
		qx.add(x);
		qy.add(y);
		map[x][y]=false;
		while(qx.size()>0) {
			x=qx.poll();
			y=qy.poll();
			for(int i=0;i<4;i++) {
				if(map[x+dx[i]][y+dy[i]])
				{
					map[x+dx[i]][y+dy[i]]=false;
					qx.add(x+dx[i]);
					qy.add(y+dy[i]);
					cnt++;
				}
			}
		}
		if(max_area<cnt)
			max_area=cnt;
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		boolean[][]map = new boolean[n+2][m+2];
		for(int i=1;i<=n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1;j<=m;j++) {
				if(st.nextToken().equals("1"))
					map[i][j]=true;
			}
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++)
				if(map[i][j])
					bfs(map, i, j);
		}
		System.out.println(cnt_works);
		System.out.println(max_area);
	}
}
