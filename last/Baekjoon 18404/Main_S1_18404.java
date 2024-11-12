import java.util.*;

public class Main_S1_18404 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(), M=sc.nextInt(), cnt=0;
		Queue<Integer> X = new LinkedList<Integer>(), Y = new LinkedList<Integer>(), D = new LinkedList<Integer>();
		X.add(sc.nextInt());
		Y.add(sc.nextInt());
		D.add(0);
		int [] ans = new int [M+1], dx = new int [] {-1,-2,-2,-1,1,2,2,1}, dy = new int [] {-2,-1,1,2,2,1,-1,-2};
		int [][] map = new int [N+1][N+1];
		for(int t=1;t<=M;t++)
			map[sc.nextInt()][sc.nextInt()]=t;
		
		if(map[X.peek()][Y.peek()]>0) {
			ans[map[X.peek()][Y.peek()]]=0;
			map[X.peek()][Y.peek()]=-1;
			cnt++;
		}
		
		while(cnt<M) {
			int curX=X.poll(), curY=Y.poll(), curD=D.poll()+1;
			for(int i=0;i<8;i++) {
				int tx = curX+dx[i], ty=curY+dy[i];
				
				if(tx>N || tx<=0 || ty>N || ty<=0)
					continue;
				else if(map[tx][ty]==-1)
					continue;
				else if(map[tx][ty]>0) {
					ans[map[tx][ty]]=curD;
					cnt++;
				}
				X.add(tx);
				Y.add(ty);
				D.add(curD);
				map[tx][ty]=-1;
			}
		}
		for(int i=1;i<=M;i++)
			System.out.print(ans[i]+" ");
	}
}
