package bronze;

import java.util.*;

public class Main_B3_2965 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
		System.out.println(c-b>b-a?c-b-1:b-a-1);
	}
}
