package gold;

import java.util.*;

public class Main_G4_16472 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),m=0, ans=0, s=0, e=0;
		String str = sc.next();
		int [] alpha = new int [26];
		while(s<=e && s<str.length()) {	// 투포인터를 이용, 시작점이 str의 길이를 넘지 않도록 함
			int cur;	// 현재 쓰는 문자
			if(m<=n && e<=str.length()-1) {	// 뒷부분이 늘어나는 경우, 갯수가 넘으면서 e가 최대 길이보다 짧을 때
				cur = str.charAt(e++)-'a';
				alpha[cur]++;	// 사용하는 문자의 갯수를 추가
				if(alpha[cur]==1)	// 만약 사용하는 문자의 개수가 1이라면 방금 추가된게 처음이므로
					m++;			// 사용중인 알파뱃의 종류를 추가
			}
			else {
				cur = str.charAt(s++)-'a';
				alpha[cur]--;		// 사용하는 알파벳의 개수를 감소
				if(alpha[cur]==0)	// 0개 사용중이면 사용하지 않기에 사용하는 알파뱃의 종류를 감소
					m--;
			}			
			if(m<=n && e-s>ans)	// 사용하는 알파뱃의 개수가 n보다 작을때 최대길이를 업데이트
				ans=e-s;				
		}
		System.out.println(ans);
	}
}
