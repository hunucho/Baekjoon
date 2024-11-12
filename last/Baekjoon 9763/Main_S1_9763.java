package silver;

import java.io.*;
import java.util.*;

public class Main_S1_9763 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()), ans=Integer.MAX_VALUE;
		
		int [][] arr = new int[n+1][3];
		for(int i=1;i<=n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<3;j++)	// 각각의 좌표 3점을 베열형태로 입력받음
				arr[i][j]=Integer.parseInt(st.nextToken());
		}
		// a-> b, b-> c의 거리를 연산하기에 b는 중복됨
		// b를 기준으로 삼고 a의 거리 c의 거리를 구해서, 가장 작은 2개의 값을 더하면 b->x, b->y로의 거리를 구하기에 다르게 생각하면 x->b->y와 같은 결과를 출력
		for(int i=1;i<=n;i++) {	// b를 i로 생각
			int bigm=9999, smallm=9999; // 시간 초과 오류를 해결하기 위해서 최소값1, 최소값2를 만들어준다.
			for(int j=1;j<=n;j++) {	// b에서 다른 위치로 가는 경로의 길이를 구하기 위한 탐색문
				int dist=0;
				if(i!=j) {	// b->b로 가는 경로는 생길 수 없음
					for(int k=0;k<3;k++)	// 좌표가 x, y, z 3개 이기에 저장형태를 반복으로 계산 
						dist+=Math.abs(arr[i][k]-arr[j][k]);
					if(dist<bigm) {	// 최소값중에서 작은 최소값 큰 최소값 두개를 만들고 큰 최소값과 비교해서 현재 계산된 최소값이 더 작다면 교환
						bigm=dist;
						if(smallm>bigm) {	// 갱신된 최소값이 작은 최소값보다 작은지 비교하고, 작은 최소값에 더 작은 최소값을 더하기 위해 swap연산을 수행
							int temp=smallm;
							smallm=bigm;
							bigm=temp;
						}
					}						
				}
			}
			ans=Math.min(smallm+bigm, ans);	// 현재까지의 최소값보다 더 작다면 그 작은 값이 답이 됨
			if(ans==2)	// 최소거리는 2보다 작을 수 없음 만약 2의 값이 있으면 탐색 종료
				break;
		}
		System.out.println(ans);
	}
}

// 실패기록
// 1. 메모리 초과
// int [][] arr = new int[n][3], dist = new int[n][n];
// a->b로 가는 모든 경로를 생성해서 a->b->c를 계산하려고함
// 메모리 초과 => (int 4 byte) * 10000 * 10000 = 400Mb
//
// 2. 시간 초과
// for(int j=0;j<n;j++) {
//	if(i==j)
//		dist[j]=9999;
//	else {
//		for(int k=0;k<3;k++)
//			dist[j]=Math.abs(arr[i][k]-arr[j][k]);
//	 }
// 	}
// 	Arrays.sort(dist);
// 	ans=ans>dist[0]+dist[1]?dist[0]+dist[1]:ans;
// }
// for문을 2두번 돌리기에 이미 최악의 경우 10000*10000 => 1억번의 연산을 하며 추가적으로 Arrays.sort를 수행하기에 대략 O(n^4)를 가져가는 코드가 됨 
