package bronze;

import java.util.Scanner;

public class Main_B3_2747 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		int a=0, b=1, c=1;
		for(int i=1;i<n;i++) {
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(c);
	}

}
