package gold;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main_G1_13460 {
	static int n,m;
	static char [][] map;	// 맵은 고정
	static Point red, blue, hole;
	static int [] dx = {1,-1,0,0}, dy= {0,0,1,-1};
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		map = new char [n][m];
		
		blue = new Point(0,0);
		hole = new Point(0,0);
		// 입력시 구슬의 위치 및 구멍의 위치를 따로 저장하고 map에는 순수 갈 수 있는 경로만 저장
		for(int i=0;i<n;i++) {
			String str = br.readLine();
			for(int j=0;j<m;j++) {
				map[i][j]=str.charAt(j);
				// 입력받은 값이 구슬이거나 구멍인 경우 위치를 따로 저장하고 그 위치를 길로 만듦
				if(map[i][j]=='R') {
					red = new Point(i,j);
					map[i][j]='.';
				}
				else if(map[i][j]=='B') {
					blue = new Point(i,j);
					map[i][j]='.';
				}
				else if(map[i][j]=='O') {
					hole = new Point(i,j);
					map[i][j]='.';
				}				
			}
		}
		int ans = BFS();
		System.out.println(ans);
	}
		
	static int BFS() {
		// move를 부르기전에 이동하는 방향에 먼저 가야하는 구슬을 이동해야함
		Queue<int [] > q = new LinkedList<int []>();
		// 처음에는 Queue<Point []> 형태로 만들었으나, cur에 대해서 값이 변경되면 원본 데이터의 값도 변해서
		// BFS를 수행하는데 문제가 생겨서 int형으로 받아서 값을 전달하는 방식으로 이용 
		
		q.add(new int [] {red.x, red.y, blue.x, blue.y, 0});
		while(q.size()>0) {
			int [] cur = q.poll();
			int cnt=cur[4];
			boolean resR=false, resB=false;
			for(int i=0;i<4;i++) {
				// moveR, moveB가 수행될 때마다 red, blue의 값이 변하기에 동일한 위치에서 4방향을 탐색해야하기에, 값을 계속 초기화 시켜줌
				red.x = cur[0];
				red.y = cur[1];
				blue.x = cur[2];
				blue.y = cur[3];
				if(i==0) {
					// 하단으로 이동할때 밑에 있는 것을 먼저 옮김
					if(red.x>blue.x) {
						resR = moveR(i);
						resB = moveB(i);
					}
					else {
						resB = moveB(i);
						resR = moveR(i);
					}
				}
				else if(i==1) {
					// 상단으로 이동할떄 위에 있는 것을 먼저 옮김
					if(red.x<blue.x) {
						resR = moveR(i);
						resB = moveB(i);
					}
					else {
						resB = moveB(i);
						resR = moveR(i);
					}
				}
				else if(i==2) {
					// 우측으로 이동할때 오른쪽에 있는 것을 먼저 옮김
					if(red.y>blue.y) {
						resR = moveR(i);
						resB = moveB(i);
					}
					else {
						resB = moveB(i);
						resR = moveR(i);
					}
				}
				else if(i==3) {
					// 좌측으로 이동할때 좌측에 있는 것을 먼저 옮김
					if(red.y<blue.y) {
						resR = moveR(i);
						resB = moveB(i);						
					}
					else {
						resB = moveB(i);
						resR = moveR(i);					
					}
				}
				if(resB)	// 파란 구슬이 홀에 들어가면 무조건 잘못된 결과이기에 넘어감
					continue;
				else if(resR)	// 빨간 구슬만 홀에 들어갔으면 조건을 만족함
					return cnt+1;
				else {	// 아무 구슬도 홀에 들어가지 않았다면 다음 단계로 탐색
					if(!(red.x==cur[0] && red.y==cur[1] && blue.x==cur[2] && blue.y==cur[3]) && cnt<9) {	// 구슬의 변화가 없다면 그 자리는 큐에 넣지 않음, 또한 탐색횟수가 10번을 넘으면 -1을 출력하기에 무시 
						q.add(new int [] {red.x, red.y, blue.x, blue.y, cnt+1});
					}
				}
			}
		}
		return -1;
	}
	// 0 : Down, 1 : Up, 2 : Right, 3 : Left
	static boolean moveR(int dir) {
		// dx, dy를 이용하여 구슬을 옮기는 방향을 정함
		int nx=dx[dir], ny=dy[dir];
		while(red.x+nx>0 && red.x+nx<n-1 && red.y+ny>0 && red.y+ny<m-1) {	// map의 범위안에 있어야함
			if(map[red.x+nx][red.y+ny]=='#' || blue.equals(new Point(red.x+nx, red.y+ny)))	// 이동하는 위치가 벽이거나, 파란구슬이면 정지
				break;
			red.x+=nx;
			red.y+=ny;
			
			if(red.equals(hole)) {	// 구멍에 들어가는 것을 판단
				red.x=0;
				red.y=0;
				return true;	// 구멍에 들어가면 True
			}
				
		}
		return false;	// 그냥 종료되면 False
	}

	static boolean moveB(int dir) {
		// dx, dy를 이용하여 구슬을 옮기는 방향을 정함
		int nx=dx[dir], ny=dy[dir];
		while(blue.x+nx>0 && blue.x+nx<n-1 && blue.y+ny>0 && blue.y+ny<m-1) {	// map의 범위안에 있어야함
			if(map[blue.x+nx][blue.y+ny]=='#' || red.equals(new Point(blue.x+nx, blue.y+ny)))	// 이동하는 위치가 벽이거나, 빨간구슬이면 정지
				break;
			blue.x+=nx;
			blue.y+=ny;
			
			if(blue.equals(hole))
				return true;	// 구멍에 들어가면 True
		}
		return false;	// 그냥 종료되면 False
	}
	
}
