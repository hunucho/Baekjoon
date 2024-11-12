import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), ans=-1;
		int [] dx = new int [] {-1, 1, 0, 0}, dy = new int [] {0, 0, -1, 1};
		int [][] chk = new int [N][M];
		boolean [][] map = new boolean [N][M];
		for(int i=0;i<N;i++) {
			String S = br.readLine();
			Arrays.fill(chk[i], 987654321);
			for(int j=0;j<M;j++)
				if(S.charAt(j)=='1')
					map[i][j]=true;
		}
		Queue<int []> q = new LinkedList<int[]>();
		q.add(map[0][0]?new int[] {0,0,1,1}:new int[] {0,0,1,0});
		chk[0][0]=map[0][0]?1:0;
		while(q.size()>0) {
			int [] cur = q.poll();
			int x = cur[0], y = cur[1], z = cur[2], cnt = cur[3];
			if(x==N-1 && y==M-1) {
				ans=z;
				break;
			}
			if(cnt>=2)
				continue;
			for(int i=0;i<4;i++) {
				int nx = x + dx[i], ny = y + dy[i];
				if(nx<0 || nx>=N || ny<0 || ny>=M)
					continue;
				if(chk[nx][ny]>cnt) {
					if((cnt+(map[nx][ny]?1:0))<=1) {
						chk[nx][ny]=cnt;
						q.add(new int [] {nx, ny, z+1, cnt+(map[nx][ny]?1:0)});
					}
				}
			}
		}
		System.out.println(ans);
	}
}
