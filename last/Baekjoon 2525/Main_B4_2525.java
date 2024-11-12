package bronze;

import java.util.Scanner;

public class Main_B4_2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
		a=(a+(b+c)/60)%24;
		b=(b+c)%60;
		System.out.println(a+" "+b);
	}
}
