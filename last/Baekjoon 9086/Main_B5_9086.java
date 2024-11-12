package bronze;

import java.util.Scanner;

public class Main_B5_9086 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++) {
			String str = sc.next();
			System.out.println(str.charAt(0)+""+str.charAt(str.length()-1));
		}
	}
}
