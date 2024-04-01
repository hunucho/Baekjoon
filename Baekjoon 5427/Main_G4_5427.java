import java.io.*;
import java.util.*;

class Main {
	
	static char [][] map;
	static int W, H;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		for(int t=0;t<T;t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			W = Integer.parseInt(st.nextToken());
			H=Integer.parseInt(st.nextToken());
			map = new char [H][W];
			for(int i=0;i<H;i++)
				map[i] = br.readLine().toCharArray();
			int ret = move();
			System.out.println(ret==-1?"IMPOSSIBLE":ret);
		}
	}
	
	static int move() {
		int ret = -1;
		int [] dx = {-1, 1, 0, 0}, dy = {0, 0, -1, 1};
		Queue<int []> q = new LinkedList<int[]>(), fire = new LinkedList<int[]>();
		
		boolean [][] visited = new boolean [H][W];
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				if(map[i][j]=='@') {
					q.add(new int [] {i, j, 0});
					visited[i][j]=true;
				} else if(map[i][j]=='*') {
					fire.add(new int [] {i, j, 0});
				}
			}
		}
		
		while(q.size()>0) {
			while(fire.size()>0 && fire.peek()[2]==q.peek()[2]) {
				int [] cur = fire.poll();
				int x = cur[0], y=cur[1], cnt=cur[2];
				for(int i=0;i<4;i++) {
					int nx = x+dx[i], ny = y+dy[i];
					if(nx>=0 && ny>=0 && nx<H && ny<W) {
						if(map[nx][ny]=='.') {
							map[nx][ny]='*';
							fire.add(new int [] {nx, ny, cnt+1});
						}
					}
				}
			}
			int [] cur = q.poll();
			int x = cur[0], y=cur[1], cnt=cur[2];
			if(x==0 || x==H-1 || y==0 || y==W-1)
				return cnt+1;
			for(int i=0;i<4;i++) {
				int nx = x+dx[i], ny = y+dy[i];
				if(nx>=0 && ny>=0 && nx<H && ny<W) {
					if(map[nx][ny]=='.' && !visited[nx][ny]) {
						visited[nx][ny]=true;
						q.add(new int [] {nx, ny, cnt+1});
					}
				}
			}
		}
		
		return -1;
	}
}
