package bronze;

import java.util.Scanner;

public class Main_B3_9085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=0;t<T;t++) {
			int n=sc.nextInt(), sum=0;
			for(int i=0;i<n;i++)
				sum+=sc.nextInt();
			System.out.println(sum);
		}
	}
}
