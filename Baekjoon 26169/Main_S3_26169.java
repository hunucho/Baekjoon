import java.util.*;

public class Main {
	static int [][] map;
	static boolean ans = false;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		map = new int[5][5];
		for (int i = 0; i <5 ; i++)
			for (int j = 0; j <5; j++)
				map[i][j] = sc.nextInt();
		int r = sc.nextInt(), c=sc.nextInt();
		if(map[r][c]==1) {
			map[r][c]=-1;
			dfs(0, r, c, 1);
		} else {
			map[r][c]=-1;
			dfs(0, r, c, 0);
		}
			
		System.out.println(ans?1:0);
	}
	
	static void dfs (int depth, int x, int y, int cnt) {
		int [] dx = {-1, 1, 0, 0}, dy = {0, 0, -1, 1};
		
		if(cnt==2) {
			ans = true;
		}
		if(depth==3)
			return;
		for(int i=0;i<4;i++) {
			int nx = x+dx[i], ny = y+dy[i];
			if(nx>=0 && nx<5 && ny>=0 && ny<5) {
				if(map[nx][ny]==-1)
					continue;
				if(map[nx][ny]==1) {
					map[nx][ny]=-1;
					dfs(depth+1, nx, ny, cnt+1);
					map[nx][ny]=1;
				} else if(map[nx][ny]==0) {
					map[nx][ny]=-1;
					dfs(depth+1, nx, ny, cnt);
					map[nx][ny]=0;
				}
			}
		}
	}
}
