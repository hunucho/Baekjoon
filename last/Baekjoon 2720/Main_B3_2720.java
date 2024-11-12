package bronze;

import java.util.Scanner;

public class Main_B3_2720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=0;t<T;t++) {
			int C=sc.nextInt();
			int [] coins = {25,10,5,1};
			for(int i=0;i<4;i++) {
				System.out.print(C/coins[i]+" ");
				C%=coins[i];
			}
			System.out.println();
		}
	}
}
