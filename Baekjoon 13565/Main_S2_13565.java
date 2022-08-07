import java.io.*;
import java.util.*;

public class Main_S2_13565 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m=Integer.parseInt(st.nextToken()), n=Integer.parseInt(st.nextToken());
		char [][] map = new char [m][n];
		for(int i=0;i<m;i++)
			map[i] = br.readLine().toCharArray();
		
		Queue<int []> q = new LinkedList<>();
		for(int i=0;i<n;i++) {
			if(map[0][i]=='0') {
				q.add(new int[] {0,i});
				map[0][i]='2';
			}
		}
		int [] dx={1,-1,0,0}, dy= {0,0,1,-1};
		while(q.size()>0) {
			int [] cur = q.poll();
			int x=cur[0], y=cur[1];
			for(int i=0;i<4;i++) {
				int nx=x+dx[i], ny=y+dy[i];
				if(nx>=0 && nx<m && ny>=0 && ny<n && map[nx][ny]=='0') {
					q.add(new int[] {nx,ny});
					map[nx][ny]='2';
				}
			}
		}
		String ans="NO";
		for(int i=0;i<n;i++){
			if(map[m-1][i]=='2')
				ans="YES";
		}
		System.out.println(ans);
	}
}
