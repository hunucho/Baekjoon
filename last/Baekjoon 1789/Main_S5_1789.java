package silver;

import java.util.Scanner;

public class Main_S5_1789 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long s = sc.nextLong(), n=1;
		while(n*(n+1)/2<=s)
			n++;
		System.out.println(n-1);
	}
}
