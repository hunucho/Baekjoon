package bronze;

import java.util.*;

public class Main_B3_17614 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), ans=0;
		for(int i=1;i<=n;i++) {
			int t=i;
			while(t>0) {
				if(t%10 == 3 || t%10 == 6 || t%10 == 9)
					ans++;
				t/=10;
			}
		}
		System.out.println(ans);
	}
}
