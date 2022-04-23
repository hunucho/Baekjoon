package silver;

import java.util.Scanner;

public class Main_S5_1292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(), b=sc.nextInt();
		int ans=0, cnt=0;
		for(int i=1;;i++) {
			for(int j=1;j<=i;j++) {
				cnt++;
				if(a<=cnt && cnt<=b)
					ans+=i;			
			}
			if(cnt>b)
				break;
		}
		System.out.println(ans);
	}
}
