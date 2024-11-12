package bronze;

import java.util.*;

public class Main_B3_2476 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(), ans=0;
		for(int n=0;n<N;n++) {
			int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(), t=0;
			if(a==b && b==c)
				t=10000+a*1000;
			else if(a==b || c==a)
				t=1000+a*100;
			else if(b==c) 
				t=1000+b*100;
			else
				t=Math.max(Math.max(a, b),c)*100;
			ans=Math.max(t, ans);
		}
		System.out.println(ans);
	}
}
