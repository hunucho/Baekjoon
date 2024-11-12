package silver;

import java.io.*;
import java.util.*;

public class Main_S2_5567 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), m=Integer.parseInt(br.readLine()), ans=0;
		boolean [] chk = new boolean[n+1];
		LinkedList<LinkedList<Integer>>list = new LinkedList<LinkedList<Integer>>();
		for(int i=0;i<=n;i++)	// 친구 리스트 초기화
			list.add(new LinkedList<>());
		
		for(int i=0;i<m;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken()), b=Integer.parseInt(st.nextToken());
			list.get(a).add(b);
			list.get(b).add(a);
		}	// 양쪽으로 친구 관계를 설정해준다 a->b가 친구라면 b->a도 친구이기 때문
		
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[] {1,0});	// 1번부터 시작하고 1번은 자 자신이므로 단계를 0으로 설정
		chk[1]=true;	// 나는 따로 방문하지 않아야 함 ( 초대할 친구 목록에 포함되지 않음 )
		while(q.size()>0) {
			int [] tmp=q.poll();
			int cur = tmp[0], depth=tmp[1];	// 현재 시작하는 사람의 번호, 친구의 단계
			for(int i=0;i<list.get(cur).size();i++) {
				int adj = list.get(cur).get(i);
				if(!chk[adj] && depth<2) {	// 친구의 친구까지만 초대하기에 depth를 2로 설정하여 2를 넘어가면 초대하지 않음
					ans++;
					chk[adj]=true;	// 방문 처리
					q.add(new int[] {adj, depth+1});	// 방문하면 다음으로 검색할 사람이 됨
				}
			}
		}
		System.out.println(ans);
	}
}