package bronze;

import java.util.*;

public class Main_B2_2145 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n=sc.nextInt(), t=0;
			if(n==0)
				break;
			while(n>0) {
				t+=n%10;
				n/=10;
				if(n==0 && t>9) {
					n=t;
					t=0;
				}
			}
			System.out.println(t);
		}
	}
}
