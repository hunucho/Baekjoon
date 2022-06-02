package gold;

import java.io.*;
import java.util.*;

public class Main_G5_2174 {
	static int a,b,n,m;
	static int [][] robots, positions;
	static int [] dx, dy;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		a=Integer.parseInt(st.nextToken());
		b=Integer.parseInt(st.nextToken());
		positions = new int[b+1][a+1];	// 행렬의 크기를 반대로 연산
		st = new StringTokenizer(br.readLine());
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		robots = new int[n+1][3];	// 로봇의 위치정보 방향정보를 기억
		
		// L회전을 기준으로 동 북 서 남 방향으로 회전
		dx=new int[] {0,1,0,-1};
		dy=new int[] {1,0,-1,0};
		
		for(int i=1;i<=n;i++)
		{
			st = new StringTokenizer(br.readLine());
			int x, y;	// X와 Y를 반대로 입력받아서 연산
			y=Integer.parseInt(st.nextToken());
			x=Integer.parseInt(st.nextToken());
			robots[i][0]=x;
			robots[i][1]=y;
			char ch=st.nextToken().charAt(0);
			int dir=0;
			if(ch=='E')		// 동쪽을 보고있다면 dx, dy의 인덱스는 0
				dir=0;
			else if(ch=='N')
				dir=1;
			else if(ch=='W')
				dir=2;
			else if(ch=='S')
				dir=3;
			robots[i][2]=dir;
			positions[x][y]=i;	// positions에 로봇이 존재하는지 값으로 표현
		}
		
		boolean chk=false;
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int robot = Integer.parseInt(st.nextToken());	// 명령어에서 로봇의 번호를 입력
			char command = st.nextToken().charAt(0);	// 로봇이 움직일 명령어
			int rep = Integer.parseInt(st.nextToken());	// 반복횟수
			if(command=='F')
				chk = forward(robot, rep);
			else if(command=='L')	// 회전시 4번돌면 원래 방향으로 회귀
				robots[robot][2]=(robots[robot][2]+rep%4)%4;	// %연산을 이용하여 4의 반복횟수를 무시
			else if(command=='R')
				robots[robot][2]=(4-rep%4+robots[robot][2])%4;	// 반대로 돌면 역연산이 일어나기 때문에, 4에서 도는 횟수만큼 반대로 연산하도록 계싼
			if(chk)
				break;
		}
		if(!chk)
			System.out.println("OK");		
	}
	
	// Forward 이동의 경우 하나하나 움직이면서 충돌하는지 연산을 해야함
	static public boolean forward(int robot, int rep) {
		int x=robots[robot][0], y=robots[robot][1], dir=robots[robot][2];
		positions[x][y]=0;	// 로봇을 이동하기 때문에, 현재 있는 로봇의 존재를 맵에서 삭제
		for(int i=0;i<rep;i++) {
			x+=dx[dir];	// 로봇이 바라보고 있는 방향으로 이동
			y+=dy[dir];
			if(x<1 || x>b || y<1 || y>a) {	// 범위를 벗어난다면 벽에 박았다는 의미
				System.out.printf("Robot %d crashes into the wall", robot);
				return true;
			}
			if(positions[x][y]!=0) {	// 이동한 위치가 0이 아니라면 다른 로봇이 존재한다는 의미임
				System.out.printf("Robot %d crashes into robot %d", robot, positions[x][y]);
				return true;
			}
		}
		robots[robot][0]=x;	// 위치정보를 업데이트
		robots[robot][1]=y;
		positions[x][y]=robot;	// 지도에 로봇위치를 저장
		return false;
	}
}
