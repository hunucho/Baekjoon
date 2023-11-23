import java.util.*;

public class Main {
	static int R, C;
	static char [][] map;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		R=sc.nextInt();
		C=sc.nextInt();
		map=new char [R][C];
		boolean [][] isVisited = new boolean [R][C];
		int sheep=0, wolves=0;
		
		// v = wolf, k = sheep
		Queue<int []> q = new LinkedList<>();
		for(int i=0;i<R;i++)
			map[i]=sc.next().toCharArray();
		for(int i=0;i<R;i++)
			for(int j=0;j<C;j++) {
				if(map[i][j]=='k' || map[i][j]=='v') {
					int [] tmp = BFS(i,j,map[i][j]);
					sheep+=tmp[0];
					wolves+=tmp[1];
				}
			}
		System.out.println(sheep+" "+wolves);
					
	}
	public static int [] BFS (int x, int y, char vk) {
		int sheep=0, wolf=0;
		int [] dx = new int [] {-1, 1, 0, 0}, dy = new int [] {0, 0, -1, 1};
		if(vk=='v')
			wolf++;
		else
			sheep++;
		map[x][y]='#';
		Queue<int []> q = new LinkedList<int[]>();
		q.add(new int [] {x, y});
		while(q.size()>0) {
			int [] cur = q.poll();
			int curx=cur[0], cury=cur[1];
			for(int i=0;i<4;i++) {
				int nx = curx+dx[i], ny = cury+dy[i];
				if(nx>=0 && nx<R && ny>=0 && ny<C) {
					if(map[nx][ny]!='#') {
						q.add(new int [] {nx, ny});
						if(map[nx][ny]=='v')
							wolf++;
						else if(map[nx][ny]=='k')
							sheep++;
						map[nx][ny]='#';
					}
				}
			}
		}
		if(sheep>wolf)
			wolf=0;
		else
			sheep=0;
		return new int [] {sheep, wolf};
	}
}
