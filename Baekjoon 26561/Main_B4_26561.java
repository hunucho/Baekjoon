package bronze;

import java.util.*;

public class Main_B4_26561 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int p=sc.nextInt(), t=sc.nextInt();
			System.out.println(p-(t/7)+(t/4));
		}
	}
}
