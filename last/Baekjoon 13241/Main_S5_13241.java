package silver;

import java.util.*;

public class Main_S5_13241 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a=sc.nextLong(), b=sc.nextLong(), gcd=gcd(a,b);

		System.out.println(a*b/gcd);
	}
	public static long gcd(long a, long b) {
		long c=0;
		if(b>a) {
			c=a;
			a=b;
			b=c;
		}
		while(b>0) {
			c=a%b;
			a=b;
			b=c;
		}
		return a;
	}
}
