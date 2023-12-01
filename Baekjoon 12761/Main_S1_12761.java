import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean [] chk = new boolean [100001];
		int A=sc.nextInt(), B=sc.nextInt(), N=sc.nextInt(), M=sc.nextInt(), ans=0;
		int [] dx = {-1, 1, -1*A, A, -1*B, B}, dy = {A, B}; 
		Queue<int []> q = new LinkedList<int[]>();
		q.add(new int [] {N, 0});
		while(q.size()>0) {
			int [] cur = q.poll();
			int pos=cur[0], cnt=cur[1];
			if(pos==M) {
				ans=cnt;
				break;
			}
			for(int i=0;i<6;i++) {
				int npos = pos+dx[i];
				if(npos<0 || npos>100000)
					continue;
				if(!chk[npos]) {
					q.add(new int [] {npos, cnt+1});
					chk[npos]=true;
				}
			}
			for(int i=0;i<2;i++) {
				int npos = pos*dy[i];
				if(npos<0 || npos>100000)
					continue;
				if(!chk[npos]) {
					q.add(new int [] {npos, cnt+1});
					chk[npos]=true;
				}
			}
		}
		System.out.println(ans);
	}	
}
