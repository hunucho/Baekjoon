package bronze;

import java.util.*;

public class Main_B3_10178 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=0;t<T;t++) {
			int c=sc.nextInt(), v=sc.nextInt();
			System.out.printf("You get %d piece(s) and your dad gets %d piece(s).\n", c/v, c%v);
		}
	}
}
