package silver;

import java.util.Scanner;

public class Main_S4_10157 {

	public static String run(int c, int r, int k) {
		if (k > c * r)
			return "0";
		int[][] map = new int[c + 1][r + 1];
		int x = 1, y = 0, cnt = 0, sw = 0;
		int[] dx = { 0, 1, 0, -1 }, dy = { 1, 0, -1, 0 };
		while (cnt <= c * r) {
			for (int i = 0; i < k; i++) {
				if(x+dx[sw]>c || x+dx[sw]==0 || y+dy[sw]>r || y+dy[sw]==0)
					break;
				x+=dx[sw];
				y+=dy[sw];
				if (map[x][y] == 0)
					map[x][y] = ++cnt;
				else {
					x-=dx[sw];
					y-=dy[sw];
					break;
				}					
				if(cnt==k)
					return String.valueOf(x + " " + y);
			}
			
			sw=(sw+1)%4;
		}
		return String.valueOf(x + " " + y);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt(), r = sc.nextInt(), k = sc.nextInt();

		System.out.println(run(c, r, k).toString());

	}
}
