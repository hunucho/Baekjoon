package gold;

import java.util.*;
import java.io.*;

public class Main_G3_16441 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken());
		char [][] map = new char [n][m];
		boolean [][] pigs = new boolean [n][m], isVisited = new boolean[n][m];	// pigs배열은 가능성이 있는 위치를 true로 설정
		Queue<int[]> q = new LinkedList<int[]>();
		for(int i=0;i<n;i++) {
			String str = br.readLine();
			for(int j=0;j<m;j++) {
				map[i][j]=str.charAt(j);
				if(map[i][j]=='W')
					q.add(new int[] {i,j});
				else if(map[i][j]=='.')
					pigs[i][j]=true;
			}
		}
		int [] dx = {-1,1,0,0}, dy= {0,0,1,-1};
		while(q.size()>0) {
			int [] cur = q.poll();
			int x=cur[0], y=cur[1];
			isVisited[x][y]=true;
			
			for(int i=0;i<4;i++) {
				if(x+dx[i]>=0 && x+dx[i]<n && y+dy[i]>=0 && y+dy[i]<m) {
					// 산이라서 탐색 불가능
					if(map[x+dx[i]][y+dy[i]]=='#')
						continue;
					// 초원이거나 늑대가 있는 자리거나, 동시에 한번도 방문하지 않은 위치면 탐색
					else if((map[x+dx[i]][y+dy[i]]=='.' || map[x+dx[i]][y+dy[i]]=='W') && !isVisited[x+dx[i]][y+dy[i]]) {
						q.add(new int[] {x+dx[i], y+dy[i]});
						isVisited[x+dx[i]][y+dy[i]]=true;
						pigs[x+dx[i]][y+dy[i]]=false;	// 만약 초원이었다면 늑대가 탐색 가능한 지역이기에 돼지는 살지 못함
					}
					else if(map[x+dx[i]][y+dy[i]]=='+') {	// 빙판이라면 미끄러져서 산에 막히거나 초원까지 가야함
						int j=1;
						while(map[x+dx[i]*j][y+dy[i]*j]=='+') {	// 미끄러지기
							j++;
						}
						// 미끄러지기가 끝난 상태는 벽에 막혀서 끝나거나 초원에 도착한 경우임
						
						// 벽에 막힌 상태   W+++# 위아래로 움직일 수 있음
						// 미끄러져서 도착했다면 그 위치로부터 지나온 방향에 수직으로 탐색이 다시 가능
						// 현재 위치는 얼음이 끝난 다음 위치이기에 이동방향을 한칸 뒤로가서 큐에 삽입
						if(map[x+dx[i]*j][y+dy[i]*j]=='#' && !isVisited[x+dx[i]*(j-1)][y+dy[i]*(j-1)]) {
							q.add(new int[] {x+dx[i]*(j-1), y+dy[i]*(j-1)});
							isVisited[x+dx[i]*(j-1)][y+dy[i]*(j-1)]=true;
						}
						// 다 미끄러지고 초원  W+++. 초원부터 움직임
						// 얼음에 다 미끄러지고 초원에 도착했기에 4방탐색이 가능해짐
						// 동시에 늑대가 탐색을 했기에 돼지는 거주불가능
						if(map[x+dx[i]*j][y+dy[i]*j]=='.' && !isVisited[x+dx[i]*j][y+dy[i]*j]) {
							q.add(new int[] {x+dx[i]*j, y+dy[i]*j});
							isVisited[x+dx[i]*j][y+dy[i]*j]=true;
							pigs[x+dx[i]*j][y+dy[i]*j]=false;
						}
					}
				}
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(pigs[i][j])	// 처음에 초원 위치에서 늑대가 탐색하지 않은 경로라면 P를 출력
					bw.write('P');
				else
					bw.write(map[i][j]);
			}
			bw.write("\n");
		}
		bw.close();
	}
}

