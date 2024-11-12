package bronze;

import java.util.*;

public class Main_B2_1453 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), ans=0;
		boolean [] chk = new boolean [101];
		for(int i=0;i<n;i++) {
			int t=sc.nextInt();
			if(!chk[t])
				chk[t]=true;
			else
				ans++;
		}
		System.out.println(ans);
	}
}
