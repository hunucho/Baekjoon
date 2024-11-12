package bronze;

import java.util.*;

public class Main_B4_10768 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt(), d=sc.nextInt();
		System.out.println(m==2&&d==18?"Special":m<=2&&d<18||m==1?"Before":"After");
	}
}
