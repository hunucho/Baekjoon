package bronze;

import java.util.Scanner;

public class Main_B3_3460 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=0;t<T;t++) {
			int n=sc.nextInt(), m=0;
			while(n>0) {
				if(n%2==1)
					System.out.print(m+" ");
				n/=2;
				m++;
			}
			System.out.println();
		}
	}
}
