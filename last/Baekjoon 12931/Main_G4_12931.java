package gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_G4_12931 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), ans=0, maxt=0;;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			// 주어진 연산을 반대로 수행해서, 어떤 값이 주어질때 역으로 0으로 만들기 위한 연산횟수를 카운팅한다
			int b=Integer.parseInt(st.nextToken()), temp=0;
			while(b>0) {	// 입력받은 b배열의 값이 0보다 더 클때 계속 반복
				if(b%2==1) {	// 1번연산은 값 하나를 1증가 시키는 것은 개별적인 동작이기에, 직접 ans에 접근해 카운팅을 추가
					ans++;
					b--;		// 역을 접근하기에, 값을 1씩 빼준다.
				}
				else {		// 2번연산은 값을 두 배 시키기 때문에, 역연산으로 값을 2씩 나누어준다
					b/=2;
					temp++;	// 나누기 연산은 배열 전체에 대해 연산을 하기에, 카운팅을 해서 가장 많이 사용한 횟수를 출력
				}
			}
			maxt=Math.max(maxt, temp);
		}
		System.out.println(ans+maxt);
	}

}
