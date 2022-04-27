package gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_G5_5014 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int f=Integer.parseInt(st.nextToken()), s=Integer.parseInt(st.nextToken()), ans=-1;
		int g=Integer.parseInt(st.nextToken()), u=Integer.parseInt(st.nextToken()), d=Integer.parseInt(st.nextToken());
		Queue<int []>q = new LinkedList<int[]>();
		boolean [] chk = new boolean [f+1];
		q.add(new int[] {s,0});
		chk[s]=true;
		while(q.size()>0) {
			int [] cur=q.poll();
			int floor=cur[0], cnt=cur[1];
			// 처음 들어오는 위치가 갈려는 위치일수도 있기에, 시작시 층수를 판단함
			if(floor==g) {
				ans=cnt;
				break;
			}
			// 현재층에서 U층 버튼을 눌렸을때, 이 범위는 건물 안에 있어야함
			if (floor + u <= f) {
				if (!chk[floor + u]) {	// 방문하지 않은 층이라면 방문
					q.add(new int[] { floor + u, cnt + 1 });
					chk[floor + u] = true;
				}
			}
			// 위와 마찬가지로 내려가는 층을 눌렸을때 이 범위는 1층보다 크거나 같아야함 
			if (floor - d >= 1) {
				if (!chk[floor - d]) {
					q.add(new int[] { floor - d, cnt + 1 });
					chk[floor - d] = true;
				}
			}
		}
		if(ans==-1)	// bfs탐색안에서 갈려는 층에 도착하지 못했다면 출력
			System.out.println("use the stairs");
		else
			System.out.println(ans);
	}
}
