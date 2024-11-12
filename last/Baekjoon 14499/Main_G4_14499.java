import java.util.*;

public class Main {
	static int N, M, top, x, y;
	static int[][] map;
	static int[] dice;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		map = new int[N][M];
		dice = new int[6];
		x = sc.nextInt();
		y = sc.nextInt();
		int K = sc.nextInt();
		for (int i = 0; i < N; i++)
			for (int j = 0; j < M; j++)
				map[i][j] = sc.nextInt();
		for (int i = 0; i < K; i++) {
			int dir = sc.nextInt() - 1;
			int ans;
			if ((ans = roll(dir))>=0)
				System.out.println(ans);
		}
	}

//	  1
//	3 0 2
//	  4
//	  5	  
	public static int roll(int dir) {
		int[] dx = new int[] { 0, 0, -1, 1 }, dy = new int[] { 1, -1, 0, 0 };
		int nx = x + dx[dir], ny = y + dy[dir];
		if (nx < 0 || N <= nx || ny < 0 || M <= ny)
			return -1;
		int tmp = dice[0];
		if (dir == 0) {
			dice[0] = dice[3];
			dice[3] = dice[5];
			dice[5] = dice[2];
			dice[2] = tmp;
		} else if (dir == 1) {
			dice[0] = dice[2];
			dice[2] = dice[5];
			dice[5] = dice[3];
			dice[3] = tmp;
		} else if (dir == 2) {
			dice[0] = dice[4];
			dice[4] = dice[5];
			dice[5] = dice[1];
			dice[1] = tmp;
		} else if (dir == 3) {
			dice[0] = dice[1];
			dice[1] = dice[5];
			dice[5] = dice[4];
			dice[4] = tmp;
		}
		
		if(map[nx][ny]==0)
			map[nx][ny]=dice[5];
		else {
			dice[5]=map[nx][ny];
			map[nx][ny]=0;
		}
		x=nx;
		y=ny;
		return dice[0];
	}
}
