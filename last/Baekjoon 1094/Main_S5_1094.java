package silver;

import java.util.Scanner;

public class Main_S5_1094 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int t=64,ans=0;
		// 최종적으로 만들어지는 X에 대한 답은 2^n을 더해서 나오는 비트의 갯수이다
		// 64부터 2씩 나눠가면서 x에서 뺄수 있는 값의 갯수를 찾으면 답임
		while(x>0) {
			if(x>=t) {
				x-=t;
				ans++;
			}
			t/=2;
		}
		System.out.println(ans);
	}
}
