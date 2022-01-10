package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_B2_2231 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int ans=0;
		for(int i=1;i<n;i++) {
			int temp_sum=i;		// 가장 작은 생성자 후보, 1부터 시작
			int temp_i=i;		// 각 자리수를 위한 임시 생성자 후보
			while(temp_i>0) {
				temp_sum+=temp_i%10;	// 각 자리수 분해
				temp_i/=10;
			}
			if(temp_sum==n) {	// 생성자 후보로 만들어진 값이 n과 같은지 판단
				ans=i;
				break;
			}
		}
		System.out.println(ans);
	}

}
