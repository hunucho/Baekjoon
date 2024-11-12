package gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_G5_7576 {
	static int n,m,cnt;
	static boolean[][] visited;
	static int arr[][];
	static Queue< int[]> q;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		m=Integer.parseInt(st.nextToken());
		n=Integer.parseInt(st.nextToken());
		cnt=m*n;
		q=new LinkedList<int[]>();
		arr=new int[n][m];
		visited = new boolean[n][m];
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<m;j++)
			{
				int temp=Integer.parseInt(st.nextToken());
				arr[i][j]=temp;
				if(temp==-1) {
					cnt--;
					visited[i][j]=true;
				}
				else if(temp==1) {
					cnt--;
					visited[i][j]=true;
					q.add(new int[] {i,j,0});
				}
				
			}
		}
		System.out.println(bfs());
	}
	public static int bfs() {
		int day=0;
		int [] dx= {-1,1,0,0}, dy= {0,0,-1,1};
		while(q.size()>0||cnt>0) {
			int[]dir=q.poll();
			if(dir==null)
				break;
			for(int i=0;i<4;i++) {
				if(dir[0]+dx[i]>=0 && dir[0]+dx[i]<n && dir[1]+dy[i]>=0 && dir[1]+dy[i]<m 
						&& visited[dir[0]+dx[i]][dir[1]+dy[i]]==false)
				{
					q.add(new int[] {dir[0]+dx[i],dir[1]+dy[i],dir[2]+1});
					visited[dir[0]+dx[i]][dir[1]+dy[i]]=true;
					cnt--;
					day=dir[2]+1;
				}
					
			}
		}
		if(cnt==0)
			return day;
		else
			return -1;
	}
}
