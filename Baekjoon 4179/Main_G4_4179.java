import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R=sc.nextInt(), C=sc.nextInt(), sx=0, sy=0, ans=987654321;
		int [] dx = new int [] {-1, 1, 0, 0}, dy = new int [] {0, 0, -1, 1};
		boolean [][] isVisited = new boolean [R][C];
		char [][] maze = new char [R][C];
		Queue<int []> fires = new LinkedList<>(), q = new LinkedList<>();
		for(int i=0;i<R;i++) {
			maze[i]=sc.next().toCharArray();
			for(int j=0;j<C;j++)
				if(maze[i][j]=='J') {
					sx=i;
					sy=j;
				} else if(maze[i][j]=='F')
					fires.add(new int [] {i,j,0});
		}
		isVisited[sx][sy]=true;
		q.add(new int [] {sx, sy, 0});
		while(q.size()>0) {
			int [] cur = q.poll();
			int curx=cur[0], cury=cur[1], curcnt=cur[2];
			while(!fires.isEmpty() && curcnt==fires.peek()[2]) {
				int [] fire = fires.poll();
				int firex = fire[0], firey=fire[1], firecnt=fire[2];
				isVisited[firex][firey]=true;
				for(int i=0;i<4;i++) {
					int nx = firex+dx[i], ny = firey+dy[i];
					if(nx>=0 && nx<R && ny>=0 && ny<C) {
						if(!isVisited[nx][ny] && maze[nx][ny]!='#') {
							fires.add(new int [] {nx, ny, firecnt+1});
							isVisited[nx][ny]=true;
						}
					}
				}
			}
			for(int i=0;i<4;i++) {
				int nx = curx+dx[i], ny = cury+dy[i];
				if(nx<0 || nx>=R || ny<0 || ny>=C) {
					System.out.println(curcnt+1);
					return;
				}
				if(nx>=0 && nx<R && ny>=0 && ny<C) {
					if(maze[nx][ny]=='.' && !isVisited[nx][ny]) {
						q.add(new int [] {nx, ny, curcnt+1});
						isVisited[nx][ny]=true;
					}
				}
			}			
		}			
		System.out.println("IMPOSSIBLE");
	}
}
