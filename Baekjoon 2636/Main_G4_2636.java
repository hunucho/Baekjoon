package gold;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_G4_2636 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int height = Integer.parseInt(st.nextToken()), width = Integer.parseInt(st.nextToken());
		int cheesecnt = 0, time=0, prevcheesecnt=0;
		boolean [][] cheese = new boolean[height][width];
		

		// make cheese map
		for (int i = 0; i < height; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < width; j++) {
				if(st.nextToken().equals("1"))
					cheese[i][j]=true;
				if (cheese[i][j])
					cheesecnt++;
			}
		}

		int[] dx = { 1, -1, 0, 0 }, dy = { 0, 0, 1, -1 };
		while (cheesecnt > 0) {
			boolean [][] chk = new boolean[height][width];
			prevcheesecnt=0;
			Queue<Point> q = new LinkedList<Point>();
			q.add(new Point(0, 0));
			chk[0][0]=true;
			while (q.size() > 0) {
				int x = q.peek().x;
				int y = q.peek().y;
				q.poll();
				for(int k=0;k<4;k++)
				{
					if(x+dx[k]<0 || x+dx[k]>=height ||y+dy[k]<0 || y+dy[k]>=width || chk[x+dx[k]][y+dy[k]])
						continue;
					if(cheese[x+dx[k]][y+dy[k]]) {
						prevcheesecnt++;
						cheese[x+dx[k]][y+dy[k]]=false;
					}
					else {
						q.add(new Point(x+dx[k], y+dy[k]));
					}
					chk[x+dx[k]][y+dy[k]]=true;
				}
			}
			time++;
			cheesecnt-=prevcheesecnt;
			
		}
		System.out.println(time);
		System.out.println(prevcheesecnt);
	}
}
