package bronze;

import java.util.Scanner;

public class Main_B4_25625 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt(), y=sc.nextInt(), ans=0;
		if(x>y)
			ans=x+y;
		else
			ans=y-x;
		System.out.println(ans);
	}
}
