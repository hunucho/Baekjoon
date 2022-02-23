package gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_G3_16236 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int n = Integer.parseInt(br.readLine()), x = 0, y = 0, time = 0, level=2, eatcnt=0;;
		int[][] map = new int[n + 2][n + 2];
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if (map[i][j] == 9) {
					x = i;
					y = j;
					map[x][y]=0;
				}
			}
		}
		int[] temp = new int[5];
		int cnt=1;
		while (true) {
			temp = search(map, x, y, level, eatcnt, n);
			if (temp[0] == 0 && temp[1] == 0) {
				System.out.println(time);
				break;
			}
			else {
				x=temp[0];
				y=temp[1];
				level=temp[2];
				eatcnt=temp[3];
				time += temp[4];
//				System.out.printf("cnt : %2d, (%2d, %2d), lv : %d, time : %d\n",cnt++,x,y,level,time);
			}
		}
	}

	public static int[] search(int[][] map, int x, int y, int level, int eatcnt, int n) {
		int time = 0, depth=0;
		int[] dx = new int[] { -1, 0, 0, 1 }, dy = new int[] { 0, -1, 1, 0 };
		boolean[][] chk = new boolean[n + 2][n + 2];
		PriorityQueue<int[]> q = new PriorityQueue<int[]>(new Comparator<int []>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[5]==o2[5]) {
				if(o1[0]==o2[0])
					return o1[1]-o2[1];
				return o1[0]-o2[0];
				}
				return o1[5]-o2[5];
			};
		});
		q.add(new int[] {x,y,level,eatcnt,time, depth});
		
		chk[x][y] = true;
		while (q.size() > 0) {
			int[] arr = new int[5];
			arr=q.poll();
			x = arr[0];
			y = arr[1];
			level = arr[2];
			eatcnt = arr[3];
			time = arr[4];
			depth=arr[5];
			if (map[x][y] < level && map[x][y]!=0) {
				eatcnt++;
				map[x][y]=0;
				if (eatcnt == level) {
					level++;
					eatcnt=0;
				}
				return new int[] { x, y, level, eatcnt, time };
			}
			for (int k = 0; k < 4; k++) {
				if (x + dx[k] > 0 && x + dx[k] <= n && y + dy[k] > 0 && y + dy[k] <= n) {
					if (map[x + dx[k]][y + dy[k]] <= level && !chk[x + dx[k]][y + dy[k]]) {
						chk[x + dx[k]][y + dy[k]] = true;
						q.add(new int[] {x + dx[k],y + dy[k], level, eatcnt, time+1, depth+1});
					}
				}
			}
		}
		return new int[] { 0, 0, level, eatcnt, time };
	}
}
