package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_S1_21608 {
	static int [][] map, fav;
	static int [] dx= {-1,0,0,1}, dy= {0,-1,1,0};
	static int n;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n= Integer.parseInt(br.readLine());
		map = new int[n+2][n+2];
		fav = new int [n*n+1][4];
		int [] order = new int[n*n];
		for(int i=0;i<n*n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int student=Integer.parseInt(st.nextToken());
			for(int j=0;j<4;j++)
				fav[student][j]=Integer.parseInt(st.nextToken());
			order[i]=student;
		}
		for(int i=0;i<n*n;i++)
			rule1(order[i]);
		int sum=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++)
				sum+=check(i,j);
//				System.out.print(map[i][j]+" ");
//			System.out.println();
		}
		System.out.println(sum);
	}
	
	public static int check(int x, int y) {
		int sum=0;
		for(int i=0;i<4;i++)
			for(int k=0;k<4;k++)
				if(map[x+dx[i]][y+dy[i]]==fav[map[x][y]][k])
					sum++;
			
		if(sum==1)
			return 1;
		if(sum ==2)
			return 10;
		if(sum ==3)
			return 100;
		if(sum ==4)
			return 1000;
		return 0;
	}
	
	public static void rule1(int student) {
		int max=0;
		
		Queue<int []>q = new LinkedList<int[]>();	// 실제로 반환될 큐
		for(int i=1;i<=n;i++)	// 완전탐색
			for(int j=1;j<=n;j++) {
				int temp=0;
				if(map[i][j]==0) {
					for(int k=0;k<4;k++)	// 좋아하는 학생의 번호 기준 
						for(int l=0;l<4;l++)	// 사방탐색
							if(map[i+dx[l]][j+dy[l]]==fav[student][k]) {	// 존재하면
								temp++;	// 인접한 학생의 수를 증가
								break;
							}
					if(temp>=max) {
						q.add(new int[] {i,j,temp});
						max=temp;
					}
				}
			}
		if(q.size()>=2)
			rule2(student, q, max);
		else
			map[q.peek()[0]][q.peek()[1]]=student;
	}
	
	public static void rule2(int student, Queue<int []>q, int max) {
		int maxempty=0;
		Queue<int []> q2 = new LinkedList<int[]>();
		while(q.size()>0) {
			int [] cur=q.poll();
			int x=cur[0], y=cur[1], cnt=cur[2];
			if(cnt<max)
				continue;
			int temp=0;
			for(int i=0;i<4;i++) {
				if(map[x+dx[i]][y+dy[i]]==0 && x+dx[i]>0 && x+dx[i]<=n &&y+dy[i]>0 &&y+dy[i]<=n)
					temp++;
			}
			if(maxempty<=temp) {
				maxempty=temp;
				q2.add(new int[]{x,y,temp});
			}
		}
		if(q2.size()>=2)
			rule3(student, q2, maxempty);
		else
			map[q2.peek()[0]][q2.peek()[1]]=student;
	}
	
	public static void rule3(int student, Queue<int []>q, int max) {
		while(q.size()>0) {
			int [] cur=q.poll();
			int x=cur[0], y=cur[1], cnt=cur[2];
			if(cnt<max)
				continue;
			map[x][y]=student;
			return;
		}
	}
}
