package bronze;

import java.util.Scanner;

public class Main_B4_23795 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans=0, t;
		while((t=sc.nextInt())>=0)
			ans+=t;
		System.out.println(ans);
	}
}
