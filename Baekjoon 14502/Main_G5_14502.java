package gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_G5_14502 {
	static int[][] map;
	static int n,m,ans;
	
	public static void combi(int depth, int r, int c) {
		if(depth==3) {
			virus();
			return;
		}
		
		for(int i=r;i<n;i++)
		{
			for(int j=c;j<m;j++)
			{
				if(map[i][j]==0)
				{
					map[i][j]=1;
					combi(depth+1,i,j);
					map[i][j]=0;
				}
			}
			c=0;
		}
	}
	
	public static void virus() {
		int[] dx = { -1, 1, 0, 0 }, dy = { 0, 0, -1, 1 };
		boolean [][] chk = new boolean[n][m];
		Queue<Integer> qx = new LinkedList<Integer>(), qy = new LinkedList<Integer>();
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(map[i][j]==2) {
					qx.add(i);
					qy.add(j);
					chk[i][j]=true;
				}
				if(map[i][j]==1)
					chk[i][j]=true;
			}
		}
		
		
		while (qx.size() > 0) {					
			int x = qx.poll(), y = qy.poll();
			
			for (int i = 0; i < 4; i++) {
				if(x+dx[i]<0 || x+dx[i]>=n || y+dy[i]<0 || y+dy[i]>=m)
					continue;
				if (!chk[x + dx[i]][y + dy[i]] && map[x + dx[i]][y + dy[i]]==0)
				{
					qx.add(x + dx[i]);
					qy.add(y + dy[i]);
					
					chk[x + dx[i]][y + dy[i]] = true;
				}
			}
		}
		int cnt=0;
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				if(!chk[i][j])
					cnt++;
		if(cnt>ans)
			ans=cnt;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++)
				map[i][j]=Integer.parseInt(st.nextToken());
		}
		combi(0,0,0);
		
		System.out.println(ans);
	}
}

