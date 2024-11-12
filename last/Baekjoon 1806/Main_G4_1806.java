package gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_G4_1806 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()), s = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int f=0,e=0,sum=0,ans=Integer.MAX_VALUE;
		int [] arr = new int[n+1];
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			// 입력받는 모든 값을 투포인터를 이용하여 뒤로 더함
			sum+=arr[e++];
			// 만약 sum이 s보다 크다면
			if(sum>=s) {
				while(sum-arr[f]>=s && f<n)	// 앞에서부터 값을 뺌으로 최소한의 길이를 만듦
					sum-=arr[f++];
			}
			if(sum>=s && e-f<ans) {	// s가 sum보다 크거나 같고, e-f 즉 길이가 답으로 저장된 길이보다 짧으면 대체
				ans=e-f;
			}
		}
		if(s==0)	// 만약에 s가 0이라면 아무런 값이나 하나를 선택하면 되기에 답을 1로 바꿔줌
			ans=1;
		// 처음에 ans를 MAX값을 주어 한번이라도 값이 바뀌지 않는다면 s를 만족하지 않는 합이기에 이때는 0을 출력해줌 
		System.out.println(ans==Integer.MAX_VALUE?0:ans);
			
	}
}
