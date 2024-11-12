package bronze;

import java.util.Scanner;

public class Main_B2_2702 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=0;t<T;t++) {
			int a=sc.nextInt(), b=sc.nextInt(), gcd=gcd(Math.max(a, b),Math.min(a, b));
			System.out.println(a*b/gcd+" "+gcd);
		}
	}
	
	public static int gcd(int a, int b) {
		while(b>0) {
			int c=a%b;
			a=b;
			b=c;
		}
		return a;
	}
}
