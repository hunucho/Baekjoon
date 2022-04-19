package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_S3_2003 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int [] arr = new int[n+1];	// 끝점이 배열을 넘어가서 빈공간에 대기하는 형태를 만들기 위해 N에 1을 추가
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++)
			arr[i]=Integer.parseInt(st.nextToken());
		int s=0,e=1,sum=arr[0], ans=0;
		// N은 1개이상이기에 arr[0]을 더한 값에 넣고 시작한다
		do {
			// 합이 M과 같으면 ans를 증가한다
			if(sum==m)
				ans++;
			// 현재까지 더해진 값이 sum보다 작으면 j방향으로 더 추가하여 전체 합을 증가
			// e가 이미 끝까지 돌았다면 그 위치에서 기다리고 있는다
			if(sum<m && e!=n) 
				sum+=arr[e++];
			// 앞의 i를 증가하는 부분을 else if로 넣지 않아, if(sum==m)가 종료된 후에도 실행 되도록 만들어줌.
			else
				sum-=arr[s++];
		}while(s<=e);	// 시작점과 끝점이 역전하거나 같은 순간 모든 부분은 탐색됨
		
		System.out.println(ans);
	}
}
