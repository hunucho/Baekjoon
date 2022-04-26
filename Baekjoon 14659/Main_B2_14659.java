package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_B2_14659 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st= new StringTokenizer(br.readLine());
		int [] mt = new int [n];
		for(int i=0;i<n;i++)
			mt[i]=Integer.parseInt(st.nextToken());
		// ans = 최종 결과, tmp = 최대 높이가 갱신 될 때마다 새로 카운트
		int ans=0, tmp=0, high=0;
		for(int i=0;i<n;i++) {
			// 최대 높이가 갱신이 되면 최대 높이를 바꾸고 자기 보다 작은 높이를 찾는 것을 새로 시작
			if(mt[i]>high) {
				high=mt[i];
				tmp=0;
			}
			else
				tmp++;
			ans=Math.max(ans, tmp);
		}
		System.out.println(ans);
	}
}
