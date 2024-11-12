package bronze;

import java.util.*;

public class Main_B2_23037 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), ans=0;
		while(n>0) {
			int t=n%10;
			n/=10;
			ans+=Math.pow(t, 5);
		}
		System.out.println(ans);
	}
}
