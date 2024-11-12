import java.io.*;
import java.util.*;

public class Main {

	static int N, M;
	static int[][] map, arr;

	static void assignNum(int r, int c, int num) {
		int[] dx = { -1, 1, 0, 0 }, dy = { 0, 0, -1, 1 };
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[] { r, c });
		map[r][c]=num;
		while (q.size() > 0) {
			int[] cur = q.poll();
			int curR = cur[0], curC = cur[1];
			for (int i = 0; i < 4; i++) {
				int nx = curR + dx[i], ny = curC + dy[i];
				if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
					if (arr[nx][ny]==1 && map[nx][ny]==0) {
						map[nx][ny]=num;
						q.add(new int[] { nx, ny});
					}
				}
			}
		}
	}
	
	static int findShortest(int r, int c, int num) {
		int[] dx = { -1, 1, 0, 0 }, dy = { 0, 0, -1, 1 };
		Queue<int[]> q = new LinkedList<int[]>();
		boolean [][] visited = new boolean [N][N];
		q.add(new int[] { r, c, 0 });
		visited[r][c]=true;
		
		while (q.size() > 0) {
			int[] cur = q.poll();
			int curR = cur[0], curC = cur[1], cnt = cur[2];
			for (int i = 0; i < 4; i++) {
				int nx = curR + dx[i], ny = curC + dy[i];
				if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
					if (!visited[nx][ny] && map[nx][ny]!=num) {
						if(map[nx][ny]!=0 && map[nx][ny]!=num)
							return cnt;
						visited[nx][ny]=true;
						q.add(new int[] {nx, ny, cnt+1});
					}
				}
			}
		}
		return Integer.MAX_VALUE;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		map = new int[N][N];
		int num=1;
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				int tmp = Integer.parseInt(st.nextToken());
				arr[i][j] = tmp;
			}
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(arr[i][j]==1 && map[i][j]==0) {
					assignNum(i, j, num);
					num++;
				}
			}
		}
		int ans=Integer.MAX_VALUE;
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(map[i][j]!=0) {
					ans = Math.min(ans, findShortest(i, j, map[i][j]));
				}
			}
		}
		
		System.out.println(ans);
		
	}
}
