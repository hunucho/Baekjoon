package silver;

import java.io.*;
import java.util.*;

public class Main_S2_3184 {
	static char [][] map;	// 입력 맵
	static boolean [][] chk;	// 방문한 위치인지 확인	
	static int sheeps, wolves, r, c;	// 최종 출력될 양과 늑대의 수
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		r=Integer.parseInt(st.nextToken());
		c=Integer.parseInt(st.nextToken());
		map = new char [r][c];
		chk = new boolean [r][c];
		for(int i=0;i<r;i++)
			map[i]=br.readLine().toCharArray();
		
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)	// 전체 맵을 순회하면서 방문하지 않은 구역이 있다면 방문
				if(map[i][j]!='#' && !chk[i][j])	// 울타리는 방문하지 못함
					bfs(i,j);
		
		System.out.println(sheeps+" "+wolves);
	}
	
	static public void bfs(int x, int y) {
		int [] dx = {1,-1,0,0}, dy= {0,0,1,-1};
		int sheep=0, wolf=0;
		Queue<Integer> qx = new LinkedList<Integer>(), qy = new LinkedList<Integer>();
		qx.add(x);
		qy.add(y);
		chk[x][y]=true;	// 시작위치 방문처리
	
		while(qx.size()>0) {
			x=qx.poll();
			y=qy.poll();
			if(map[x][y]=='o')	// 방문위치가 양일때 그 구역내에서의 양의 수를 증가
				sheep++;
			else if(map[x][y]=='v')	// 방문위치가 늑대라면 구역내에서의 늑대의 수를 증가
				wolf++;
			
			for(int i=0;i<4;i++) {
				if(x+dx[i]>=0 && x+dx[i]<r && y+dy[i]>=0 && y+dy[i]<c) {	// 사방탐색
					if(!chk[x+dx[i]][y+dy[i]] && map[x+dx[i]][y+dy[i]]!='#') {	// 방문한 위치가 아니고, 위치가 울타리가 아니라면 탐색 가능
						qx.add(x+dx[i]);
						qy.add(y+dy[i]);
						chk[x+dx[i]][y+dy[i]]=true;
					}
				}
			}
		}
		
		if(sheep>wolf)	// 양의 수가 늑대의 수보다 많을때는 늑대를 몰아냄
			sheeps+=sheep;	// 양의 수만 증가
		else	// 늑대의 수가 양보다 같거나 많을때 늑대의 수를 증가
			wolves+=wolf;
	}
}
