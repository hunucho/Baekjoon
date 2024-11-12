package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_B3_20361 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()); // 둘째 줄 입력
		int n = Integer.parseInt(st.nextToken()), x = Integer.parseInt(st.nextToken()),
				k = Integer.parseInt(st.nextToken());
		// 둘째 줄에서 입력 받은 값에서 n,x,k를 추출
		for (int i = 0; i < k; i++) { // n번 반복
			st = new StringTokenizer(br.readLine()); // 셋째 줄아서 A,B의 위차 입력
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			if (a == x) // 만약 현 위치가 입력받는 값에 있다면 다른 자리와 바뀔 것이므로 a가 x일 경우에 x를 b로 대체
				x = b;
			else if (b == x) // 위와 동일
				x = a;
		}
		System.out.println(x); // #케이스번호, x의 위치를 출력
	}
}
