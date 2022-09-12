package bronze;

import java.util.*;

public class Main_B3_2460 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max=0, cur=0;
		for(int i=0;i<10;i++) {
			cur-=sc.nextInt();
			cur+=sc.nextInt();
			max=Math.max(max, cur);
		}
		System.out.println(max);
	}
}
