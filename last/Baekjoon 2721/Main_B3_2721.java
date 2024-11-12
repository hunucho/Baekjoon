package bronze;

import java.util.*;

public class Main_B3_2721 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(;T>0;T--) {
			int n=sc.nextInt(),k=1,W=0;
			for(int i=1;i<=n;i++) {
				k+=(i+1);
				W+=k*i;
			}
			System.out.println(W);
		}
	}
}
