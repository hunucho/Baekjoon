import java.util.*;

public class Main {
	static int N, M;
	static char [][] map;
	static boolean [][] chk;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		M=sc.nextInt();
		N=sc.nextInt();
		int B=0, W=0;
		map = new char [N][M];
		chk = new boolean [N][M];
		for(int i=0;i<N;i++)
			map[i]=sc.next().toCharArray();
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(!chk[i][j]) {
					chk[i][j]=true;
					if(map[i][j]=='B')
						B+=bfs(i,j,'B');
					else
						W+=bfs(i,j,'W');
				}
			}
		}
		System.out.println(W+" "+B);
	}
	public static int bfs(int posx, int posy, char z) {
		int [] dx = new int [] {-1, 1, 0, 0}, dy = new int [] {0, 0, -1, 1};
		int ans=1;
		Queue<int []> q = new LinkedList<>();
		q.add(new int [] {posx, posy});
		while(q.size()>0) {
			int [] cur = q.poll();
			int x=cur[0], y=cur[1];
			for(int i=0;i<4;i++) {
				int nx=x+dx[i], ny=y+dy[i];
				if(nx>=0 && nx<N && ny>=0 && ny<M) {
					if(!chk[nx][ny] && map[nx][ny]==z) {
						ans++;
						chk[nx][ny]=true;
						q.add(new int [] {nx, ny});
					}
				}
			}
		}
		return ans*ans;
	}
}
