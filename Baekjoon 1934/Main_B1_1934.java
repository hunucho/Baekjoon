package bronze;

import java.util.*;

public class Main_B1_1934 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			int a=sc.nextInt(), b=sc.nextInt();
			System.out.println(a*b/gcd(a,b));
		}
	}
	public static int gcd(int a, int b) {
		int t;
		if(b>a) {
			t=a;
			a=b;
			b=t;
		}
		while(b>0) {
			a%=b;
			t=a;
			a=b;
			b=t;
		}			
		return a;
	}
}
