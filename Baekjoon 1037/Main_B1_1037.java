package bronze;

import java.util.*;

public class Main_B1_1037 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long min=9999999, max=0;
		for(int i=0;i<n;i++) {
			long tmp=sc.nextLong();
			min=Math.min(min, tmp);
			max=Math.max(max, tmp);
		}
		System.out.println(min*max);
	}
}
