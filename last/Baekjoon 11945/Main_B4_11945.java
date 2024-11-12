package bronze;

import java.util.Scanner;

public class Main_B4_11945 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), m=sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++) {
			sb.append(sc.next()).reverse();
			System.out.println(sb.toString());
			sb.setLength(0);
		}
	}
}
