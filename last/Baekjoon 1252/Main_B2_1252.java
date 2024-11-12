package bronze;

import java.util.*;

public class Main_B2_1252 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = Long.valueOf(sc.next(),2), b = Long.valueOf(sc.next(), 2);
		System.out.println(Long.toBinaryString(a+b));
	}
}
