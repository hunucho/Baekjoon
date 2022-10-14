package bronze;

import java.util.Scanner;

public class Main_B3_9325 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=0;t<T;t++) {
			int s=sc.nextInt(), n=sc.nextInt();
			for(int j=0;j<n;j++) {
				int  q=sc.nextInt(), p=sc.nextInt();
				s+=q*p;
			}
			System.out.println(s);
		}
	}
}
