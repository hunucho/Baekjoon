package silver;

import java.util.*;

public class Main_S5_1476 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int e=sc.nextInt()-1, s=sc.nextInt()-1, m=sc.nextInt()-1, ans=1;
		int a=0, b=0, c=0;
		while(true) {
			if(a==e && b==s && c==m)
				break;
			a=(a+1)%15;
			b=(b+1)%28;
			c=(c+1)%19;
			ans++;
		}
		System.out.println(ans);
	}
}
