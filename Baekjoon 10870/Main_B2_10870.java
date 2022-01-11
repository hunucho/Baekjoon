package bronze;

import java.util.Scanner;

public class Main_B2_10870 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		int a=0, b=1, c=1;
		if(n==0) {
			System.out.println(0);
			return;
		}
		for(int i=1;i<n;i++) {
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(c);
	}

}
