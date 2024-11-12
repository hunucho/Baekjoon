package silver;

import java.util.*;

public class Main_S4_1980 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), m=sc.nextInt(), t=sc.nextInt();
		if(n>m) {
			int tmp=n;
			n=m;
			m=tmp;
		}
		int ab=t/n, at=t%n;
		for(int i=ab;i>=0;i--) {
			int bm=(t-i*n)/m, tt=t-(i*n+bm*m);
			if(tt<at) {
				ab=i+bm;
				at=tt;
			}
		}
		System.out.println(ab+" "+at);
	}
}
