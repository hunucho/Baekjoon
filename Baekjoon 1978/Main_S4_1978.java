package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_S4_1978 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int cnt=0;
		for(int i=0;i<n;i++) {
			boolean chk=true;
			int temp = Integer.parseInt(st.nextToken());
			if(temp==1)		// 1은 소수가 아니기에 강제적으로 제거해준다.
				chk=false;
			for(int j=2;j<=Math.sqrt(temp);j++)		// 25가 소수인지 판별할떄 5까지만 판별해도 가능하다. 소수인 5를 제곱하면 25가 되며 25의 약수는 1 5 25이다.
				if(temp%j==0) {
					chk=false;
					break;					
				}
			if(chk)
				cnt++;
		}
		System.out.println(cnt);
	}

}
