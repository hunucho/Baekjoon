package bronze;

import java.util.*;

public class Main_B4_20215 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(), b=sc.nextInt();
		System.out.println(a+b-Math.pow(a*a+b*b, 0.5));
	}
}
