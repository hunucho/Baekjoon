package bronze;

import java.util.Scanner;

public class Main_B4_11365 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while(true) {
			String str = sc.nextLine();
			if(str.equals("END"))
				break;
			sb.append(str).reverse();
			System.out.println(sb.toString());
			sb.setLength(0);
		}
	}
}
