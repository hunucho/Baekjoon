package bronze;

import java.util.Scanner;

public class Main_B3_2010 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), ans=0;
		for(int i=0;i<n;i++) {
			ans+=sc.nextInt()-1;
		}
		System.out.println(ans+1);
	}
}
