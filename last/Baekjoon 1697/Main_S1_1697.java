package silver;

import java.util.Scanner;

public class Main_S1_1697 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), cnt=1;		
		while (b>=a) {
			if(b==a) {
				System.out.println(cnt);
				return;
			}
			if(b%10==1)
				b/=10;
			else if(b%2==0)
				b/=2;
			else
				break;
			cnt++;
		}
		System.out.println(-1);
	}
}