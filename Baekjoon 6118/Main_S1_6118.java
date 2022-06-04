package silver;

import java.util.*;
import java.io.*;

public class Main_S1_6118 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken());
		int ac=0, ad=0, as=0; // 헛간의 번호, 헛간까지의 거리, 같은 거리를 갖는 헛간의 개수 
		boolean [] chk = new boolean[n+1];
		ArrayList<ArrayList<Integer>>list = new ArrayList<ArrayList<Integer>>();
		// LinkedList를 사용하면 시간초과 오류 발생
		for(int i=0;i<=n;i++)	// 리스트 초기화
			list.add(new ArrayList<>());
		
		for(int i=0;i<m;i++) {	// 헛간은 양방향으로 이루어져 있음
			st = new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken()), b=Integer.parseInt(st.nextToken());
			list.get(a).add(b);
			list.get(b).add(a);
		}
		
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[] {1,0});	// 탐색은 첫번째부터 시작하기에 1번 헛간을 방문처리 
		chk[1]=true;
		while(q.size()>0) {
			int [] tmp=q.poll();
			int cur = tmp[0], depth=tmp[1];
			if(depth==ad) {	// 깊이가 동일하면 여러개의 헛간이기에 
				ac=Math.min(ac,cur);	// 헛간 번호가 작은 헛간을 저장
				as++;	// 헛간의 개수를 증가
			}
			else if(depth>ad) {	// depth가 증가 했다면 더 깊은 헛간이 있기에
				ac=cur;	// 헛간의 번호를 바꾸고
				ad=depth; // 헛간의 거리를 최신화
				as=1;	// 헛간의 개수르 1로 초기화
			}
			for(int i=list.get(cur).size()-1;i>=0;i--) {
				int adj = list.get(cur).get(i);	// 인접해 있는 헛간을 탐색
				if(!chk[adj]) {	// 이미 탐색한 헛간이라면 탐색하지 않음
					chk[adj]=true;
					q.add(new int[] {adj, depth+1});
				}
			}
		}
		System.out.println(ac+" "+ad+" "+as);
	}
}