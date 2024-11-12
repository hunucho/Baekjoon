package silver;

import java.io.*;
import java.util.*;

public class Main_S1_14716 {
	static char [][] arr;
	static int ans, m,n;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		m=Integer.parseInt(st.nextToken());
		n=Integer.parseInt(st.nextToken());
		arr = new char [m][n];
		for(int i=0;i<m;i++)
			arr[i]=br.readLine().replace(" ", "").toCharArray();
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i][j]=='1')
					bfs(i,j);
			}
		}
		System.out.println(ans);
	}
	public static void bfs(int posx, int posy) {
		int [] dx = {-1,-1,-1,0,0,1,1,1}, dy= {-1,0,1,-1,1,-1,0,1};
		Queue<int[]> q =new LinkedList<int[]>();
		q.add(new int[] {posx,posy});
		arr[posx][posy]='0';
		while(q.size()>0) {
			int [] cur = q.poll();
			int x=cur[0], y=cur[1];
			for(int i=0;i<8;i++) {
				int nx=x+dx[i], ny=y+dy[i];
				if(nx>=0 && nx<m && ny>=0 && ny<n) {
					if(arr[nx][ny]=='1') {
						q.add(new int[] {nx,ny});
						arr[nx][ny]='0';
					}
				}
			}
		}
		ans++;
	}
}
