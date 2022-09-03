package bronze;

import java.util.Scanner;

public class Main_B2_2902 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str=str.replaceAll("[a-z]", "").replaceAll("-", "");
		System.out.println(str);
	}
}
