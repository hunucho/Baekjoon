package bronze;

import java.util.Scanner;

public class Main_B4_11943 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(), d=sc.nextInt();
		System.out.println(Math.min(a+d, b+c));
	}
}
