package gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_G3_2629 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 추의 개수
		int n = Integer.parseInt(br.readLine()), max=0;
		boolean [] weights= new boolean[100000];
		weights[0]=true;
		// 추 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			int weight=Integer.parseInt(st.nextToken());
			max=Math.max(max, weight);
			Queue<Integer> q = new LinkedList<>();
			// 나올 수 있는 모든 숫자 조합의 값을 찾음
			for(int j=0;j<=max;j++) {
				if(weights[j])
					q.add(j);
			}
			// q를 이용하여 이미 나올수 있는 값에서 새로 들어온 값을 더해 나올 수 있는 무게 갱신
			while(q.size()>0) {
				int loc=q.poll();
				weights[loc+weight]=true;
				max=Math.max(max, loc+weight);
			}
		}
		
		
		// 구슬의 개수
		int m = Integer.parseInt(br.readLine());
		// 추 입력
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<m;i++) {
			boolean chk=false;
			int marvel=Integer.parseInt(st.nextToken());
			for(int j=0;j<=max;j++)
				// 구슬을 입력받고 동일한 N의 길이가 차이나는 점에서 둘다 무게가 나올 수 있으면 그 구슬의 무게는 비교 가능
				if(weights[j] && weights[j+marvel]) {
					System.out.print("Y ");
					chk=true;
					break;
				}
			if(!chk)
				System.out.print("N ");
		} 
	}
}
