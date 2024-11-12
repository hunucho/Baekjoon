package bronze;

import java.util.*;

public class Main_B2_5598 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for(int i=0;i<str.length();i++) {
			int ch = str.charAt(i)-'A';
			System.out.print(Character.toChars((ch+23)%26+'A'));
		}
	}
}
