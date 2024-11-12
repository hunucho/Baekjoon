package silver;

import java.util.*;

public class Main_S3_1057 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), jm=sc.nextInt(), hs=sc.nextInt(), ans=0;
		// 두 인원이 싸우지 못하는 경우는 없다, 만날때까지 싸우고, 최종 결승에서 한번은 만나게 된다.
		while(jm!=hs) {	// 같은 값이 나올때까지 반복
			jm=(jm+1)/2;
			hs=(hs+1)/2;
			ans++;
		}
		System.out.println(ans);
		// 기존 위치에 1을 더하는 이유
		// jm=8, hs=9일때 바로 계산하면 둘다 4가 나오지만 실제 값은 4와 5가 되어야 한다.
		// (1,2), (3,4) / (5,6), (7,8) / (9,10)
		
		// 홀수의 경우를 생각해서 1을 더함
		// jm=1, hs=2
		// x에 1을 더하지 않은 경우
		// 1/2 = 0, 2/2 = 1	=> 다음 라운드에서 부여되는 번호가 다름
		// x에 1을 더한 경우
		// (1+1) / 2 = 1, (2+1) / 2 = 1 => 다음 라운드에서 부여되는 번호가 동일
	}
}
