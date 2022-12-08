package bronze;

import java.util.*;

public class Main_B3_10707 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(), d=sc.nextInt(), p=sc.nextInt();
		System.out.println(Math.min(a*p, c<=p?b+(p-c)*d:b));
	}
}
