package bronze;

import java.util.*;

public class Main_B4_5532 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float l=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
		System.out.println((int)(l-Math.max(Math.ceil(a/c), Math.ceil(b/d))));
	}
}
