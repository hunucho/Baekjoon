import java.io.*;
import java.util.*; 

class Main {
	static int Height, Width;
	static char [][] map;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		Height = Integer.parseInt(st.nextToken());
		Width = Integer.parseInt(st.nextToken());
		map = new char [Height][Width];
		for(int i=0;i<Height;i++)
			map[i] = br.readLine().toCharArray();
		
		int ans=0;
		for(int i=0;i<Height;i++) {
			for(int j=0;j<Width;j++) {
				if(map[i][j]=='L') {
					int dist = getfarthest(i, j);
					ans = Math.max(ans,  dist);
				}
			}
		}
		System.out.println(ans);
	}
	
	static int getfarthest (int x, int y) {
		int ret = 0;
		int [] dx = {-1, 1, 0, 0}, dy = {0, 0, -1, 1};
		boolean [][] chk = new boolean [Height][Width];
		chk[x][y]=true;
		Queue<int []> q = new LinkedList<int[]>();
		q.add(new int [] {x, y, 0});
		
		while(q.size()>0) {
			int [] cur = q.poll();
			int curx = cur[0], cury = cur[1], curcnt = cur[2];
			for(int i=0;i<4;i++) {
				int nx = curx+dx[i], ny = cury+dy[i], ncnt = curcnt+1;
				if(nx>=0 && nx<Height && ny>=0 && ny<Width) {
					if(!chk[nx][ny] && map[nx][ny]=='L') {
						q.add(new int [] {nx, ny, ncnt});
						chk[nx][ny]=true;
						ret = Math.max(ret, ncnt);
					}
				}
			}
		}
		return ret;
	}
}
