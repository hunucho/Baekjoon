package bronze;

import java.util.Scanner;

public class Main_B4_19698 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),w=sc.nextInt(),h=sc.nextInt(),l=sc.nextInt();
		System.out.println(Math.min(n, (w/l)*(h/l)));
	}
}
