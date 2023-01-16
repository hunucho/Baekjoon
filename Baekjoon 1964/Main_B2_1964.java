package bronze;

import java.util.*;

public class Main_B2_1964 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(), t=4, ans=1;
		for(int i=0;i<N;i++) {
			ans+=t;
			t+=3;
			ans%=45678;
		}
		System.out.println(ans);
	}
}
