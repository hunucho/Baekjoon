package bronze;

import java.util.Scanner;

public class Main_B2_26529 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long [] r = new long[46];
		r[0]=1;
		r[1]=1;
		for(int i=2;i<=45;i++)
			r[i]=r[i-1]+r[i-2];
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			System.out.println(r[sc.nextInt()]);
		}
	}
}
