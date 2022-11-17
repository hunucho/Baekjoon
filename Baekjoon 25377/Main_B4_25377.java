package bronze;

import java.util.*;

public class Main_B4_25377 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(), ans=9999;
		for(int n=0;n<N;n++) {
			int a=sc.nextInt(), b=sc.nextInt();
			if(a<=b)
				ans = Math.min(ans, b);
		}
		if(ans==9999)
			ans=-1;
		System.out.println(ans);
	}
}
