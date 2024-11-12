package bronze;

import java.util.*;

public class Main_B3_11006 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=0;t<T;t++) {
			int n=sc.nextInt(), m=sc.nextInt(), u=n-m;
			System.out.println(m-u+" "+u);
		}
	}
}
