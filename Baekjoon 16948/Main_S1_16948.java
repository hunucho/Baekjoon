package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_S1_16948 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st= new StringTokenizer(br.readLine());
		int r1=Integer.parseInt(st.nextToken()), c1=Integer.parseInt(st.nextToken());
		int r2=Integer.parseInt(st.nextToken()), c2=Integer.parseInt(st.nextToken());
		int [] dx= {-2,-2,0,0,2,2}, dy= {-1,1,-2,2,-1,1};
		int [][] map = new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				map[i][j]=-1;
		Queue<int []>q = new LinkedList<int[]>();
		q.add(new int [] {r1,c1,0});
		map[r1][c1]=0;
		while(q.size()>0) {
			int [] temp = q.poll();
			int x = temp[0],y = temp[1], cnt=temp[2];
			if(x==r2 && y==c2)
				break;
			for(int i=0;i<6;i++) {
				if(x+dx[i]<0 || x+dx[i]>=n || y+dy[i]<0 ||y+dy[i]>=n)
					continue;
				if(map[x+dx[i]][y+dy[i]]>0)
					continue;
				q.add(new int[] {x+dx[i], y+dy[i], cnt+1});
				map[x+dx[i]][y+dy[i]]=cnt+1;
			}
		}
		System.out.println(map[r2][c2]);
	}
}
