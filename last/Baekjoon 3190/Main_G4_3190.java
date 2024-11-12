package gold;

import java.io.*;
import java.util.*;

public class Main_G4_3190 {
	static int N, K, dir, ans;
	static int [][] map;
	static Deque<int []>dq;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		K=Integer.parseInt(br.readLine());
		map=new int[N+2][N+2];
		// 초과 범위값 -1을 이용하여 벽처리
		for(int i=0;i<N+1;i++)
			map[i][0]=map[0][i]=map[i][N+1]=map[N+1][i]=-1;
		dq = new ArrayDeque<>();
		dq.add(new int[] {1,1});
		map[1][1]=1;
		
		// map : Empty=0, snake=1, apple=2, wall=-1
		
		for(int i=0;i<K;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			map[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())]=2;
		}
		
		int L=Integer.parseInt(br.readLine());
		boolean chk=true;
		for(int i=0;i<L && chk;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			chk=move(Integer.parseInt(st.nextToken()), st.nextToken().charAt(0));
		}
		move(N*N, 'N');
		System.out.println(ans);
	}
	
	public static boolean move(int X, char C) {
		int [] dx= {0,1,0,-1}, dy= {1,0,-1,0};
		
		for(;ans<X;) {
			ans++;
			int [] next = dq.peekFirst();
			int nx=next[0]+dx[dir], ny=next[1]+dy[dir];
			if(map[nx][ny]==-1 || map[nx][ny]==1) {
				ans--;
				return false;				
			}
			else if(map[nx][ny]==2) {
				dq.addFirst(new int[] {nx,ny});
				map[nx][ny]=1;
			}
			else if(map[next[0]+dx[dir]][next[1]+dy[dir]]==0) {
				dq.addFirst(new int[] {nx, ny});
				map[nx][ny]=1;
				map[dq.peekLast()[0]][dq.peekLast()[1]]=0;
				dq.pollLast();
			}
	
		}
		
		if(C=='D')
			dir=(dir+1)%4;
		else if(C=='L')
			dir=(dir+3)%4;
		return true;
	}
}