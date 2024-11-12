import java.util.*;

public class Main_B3_2455 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans=0, tmp=0;
		for(int i=0;i<4;i++) {
			tmp-=sc.nextInt(); 
			tmp+=sc.nextInt();	
			if(ans<tmp)
				ans=tmp;
		}
		System.out.println(ans);
	}
}
// 입력받는 줄에서 첫번째 값은 내리는 사람, 두번째 줄은 타는 사람이다.
// 타는 사람이 타고 난 직후가 가장 크기에 사람이 타고 난 후에 현재 temp값을 체크하고 ans로 저장된 값볻가 크다면 그 값이 최대 사람 수이다.
