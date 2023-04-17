package bronze;

import java.util.*;

public class Main_B4_25191 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(), A=sc.nextInt(), B=sc.nextInt();
		System.out.println(Math.min(N, A/2+B));
	}
}
