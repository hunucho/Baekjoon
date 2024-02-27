import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken());
		int [][] arr = new int [N][M], brr = new int [N][M];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++)
				arr[i][j]=Integer.parseInt(st.nextToken());
		}
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++)
				brr[i][j]=Integer.parseInt(st.nextToken());
		}
		int [] dx = {-1, 1, 0, 0}, dy = {0, 0, -1, 1};
		int before=0, after=0;
		Queue<int []> q = new LinkedList<int[]>();
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M && q.size()==0;j++) {
				if(arr[i][j]!=brr[i][j]) {
					q.add(new int [] {i, j});
					before = arr[i][j];
					after = brr[i][j];
				}
			}
		}
		
		while(q.size()>0) {
			int [] cur = q.poll();
			int x=cur[0], y=cur[1];
			arr[x][y]=after;
			for(int i=0;i<4;i++) {
				int nx = x+dx[i], ny=y+dy[i];
				if(nx>=0 && nx<N && ny>=0 && ny<M) {
					if(arr[nx][ny]==before) {
						arr[nx][ny]=after;
						q.add(new int [] {nx, ny});
					}
				}
			}
		}
		
//		for(int i=0;i<N;i++) {
//			for(int j=0;j<M;j++)
//				System.out.print(arr[i][j]+" ");
//			System.out.println();
//		}
//		for(int i=0;i<N;i++) {
//			for(int j=0;j<M;j++)
//				System.out.print(brr[i][j]+" ");
//			System.out.println();
//		}
			
		boolean isEqual = true;
		for(int i=0;i<N;i++) 
			for(int j=0;j<M;j++)
				if(arr[i][j]!=brr[i][j])
					isEqual=false;
		System.out.println(isEqual?"YES":"NO");
	}
}
