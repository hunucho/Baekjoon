package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_B1_11050 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int a=1;
		// 이항 계수 = 조합의 개수 구하기
		// nC0 = 1-> n!/r!(n-r)!
		// 전체에서 n개 선택하는 것 / 선택된것 중에 순서
		for(int i=1;i<=n;i++) 
			a*=i;
		for(int i=1;i<=k;i++)
			a/=i;
		for(int i=1;i<=n-k;i++)
			a/=i;
		System.out.println(a);
	}

}
