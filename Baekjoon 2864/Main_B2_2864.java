package bronze;

import java.util.*;

public class Main_B2_2864 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next(), b = sc.next();
		System.out.print(Integer.parseInt(a.replace('6', '5')) + Integer.parseInt(b.replace('6', '5')) + " "
				+ (Integer.parseInt(a.replace('5', '6')) + Integer.parseInt(b.replace('5', '6'))));
	}
}
