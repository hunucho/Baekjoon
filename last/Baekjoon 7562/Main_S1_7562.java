package silver;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_S1_7562 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		int [] dx = {-2,-1,1,2,2,1,-1,-2}, dy= {1,2,2,1,-1,-2,-2,-1};
		
		for (int tc = 0; tc < TC; tc++) {
			int l = Integer.parseInt(br.readLine());
			boolean[][] chk = new boolean[l][l];
			int sx, sy, ex,ey;
			StringTokenizer st = new StringTokenizer(br.readLine());
			sx = Integer.parseInt(st.nextToken());
			sy = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			ex = Integer.parseInt(st.nextToken());
			ey = Integer.parseInt(st.nextToken());
			Queue<Point> q = new LinkedList<Point>();
			Queue<Integer> cnt = new LinkedList<>();
			q.add(new Point(sx,sy));
			cnt.add(0);
			chk[sx][sy]=true;
			while(q.size()>0) {
				Point pos = q.poll();
				int cur=cnt.poll();
				if(pos.x==ex && pos.y==ey)
				{
					System.out.println(cur);
					break;
				}
				for(int i=0;i<8;i++) {
					if(pos.x+dx[i]<0 || pos.x+dx[i]>=l || pos.y+dy[i]<0 || pos.y+dy[i]>=l || chk[pos.x+dx[i]][pos.y+dy[i]])
						continue;
					q.add(new Point(pos.x+dx[i],pos.y+dy[i]));
					cnt.add(cur+1);
					chk[pos.x+dx[i]][pos.y+dy[i]]=true;
				}
			}
		}
	}
}
