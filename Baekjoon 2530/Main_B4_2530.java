package bronze;

import java.util.*;

public class Main_B4_2530 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(), d=sc.nextInt();
		int aa,bb,cc;
		cc=(c+d)%60;
		b+=(c+d)/60;
		bb=b%60;
		a+=b/60;
		aa=a%24;
		System.out.println(aa+" "+bb+" "+cc);
	}
}
