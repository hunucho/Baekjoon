package bronze;

import java.util.*;

public class Main_B1_11170 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=0;t<T;t++) {
			int N=sc.nextInt(), M=sc.nextInt(), ans=0;
			for(int i=N;i<=M;i++)
				ans+=String.valueOf(i).replaceAll("[1-9]*", "").length();
			System.out.println(ans);
		}
	}
}
