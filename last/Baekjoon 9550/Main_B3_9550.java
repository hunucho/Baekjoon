package bronze;

import java.util.*;

public class Main_B3_9550 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=0;t<T;t++) {
			int n=sc.nextInt(), k=sc.nextInt(), ans=0;
			for(int i=0;i<n;i++)
				ans+=sc.nextInt()/k;
			System.out.println(ans);
		}
	}
	
}
