package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_B2_15829 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		long hash_value=0;
		for(int i=0;i<n;i++) {
			hash_value+=(s.charAt(i)-'a'+1)*fPow(31, i);
			// Math.pow로는 오버플로우가 생김 -> mod를 이용하는 거듭제곱함수를 구현해야함
			hash_value%=1234567891;
		}
		System.out.println(hash_value);
	}
	public static long fPow(int a, int b) {
		long n=1;
		for(int i=0;i<b;i++) {
			n*=a;		// 각 step별로 n값을 곱하면서
			n%=1234567891;	// mod를 이용해도 뒤에 남아있는 값은 동일하기에 M값으로 매 스텝 나누어준다.
		}
		return n;
	}
}
