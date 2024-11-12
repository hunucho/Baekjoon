package silver;

import java.io.*;
import java.util.*;

public class Main_S1_2468 {
	static boolean [][] chk;
	static int n;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		int ans=0;
		int [][] arr = new int[n][n];
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<n;j++)
				arr[i][j]=Integer.parseInt(st.nextToken());
		}
		for(int k=0;k<=100;k++) {	// 높이를 최대 높이는 100이기에 물이 100이상 오면 모든 지점은 물에 잠김
			int flood=0, cnt=0;	// flood는 모든 공간이 물에 잠겼을때 반복을 종료하기 위한 변수 ( 입력부분에서 max를 이용해도 됨 ), cnt BFS가 호출되는 영역의 개수
			chk = new boolean[n][n];
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					if(arr[i][j]<k) {	// 이미 잠긴 공간을 체크
						chk[i][j]=true;
						flood++;
					}
			if(flood==n*n)	// 모든 공간이 물에 잠기면 반복 종료
				break;
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					if(!chk[i][j]) {	// 탐색하는 공간이 불러 질경우 물에 잠기지 않은 영역임
						cnt++;
						BFS(i,j);
					}
			ans=Math.max(ans, cnt);
		}
		System.out.println(ans);
	}
	static void BFS (int x, int y) {
		Queue<int []> q = new LinkedList<int[]>();
		q.add(new int[] {x,y});
		chk[x][y]=true;
		int[] dx = {1,-1,0,0}, dy = {0,0,1,-1};
		while(q.size()>0) {
			int [] cur = q.poll();
			x=cur[0];
			y=cur[1];
			for(int i=0;i<4;i++) {
				int nx = x+dx[i], ny=y+dy[i];
				if(nx<0 || nx>=n || ny<0 || ny>=n || chk[nx][ny])
					continue;
				chk[nx][ny]=true;
				q.add(new int[] {nx,ny});
			}
		}
	}
}
