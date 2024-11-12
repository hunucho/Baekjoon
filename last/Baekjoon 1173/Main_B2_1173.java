package bronze;

import java.util.Scanner;

public class Main_B2_1173 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N,m,M,T,R;
		N=sc.nextInt();
		m=sc.nextInt();
		M=sc.nextInt();
		T=sc.nextInt();
		R=sc.nextInt();
		int ans=0, cnt=0, X=m;
		if(m+T>M)
			ans=-1;
		else {
			while(cnt<N) {
				if(X+T<=M) {
					X+=T;
					cnt++;
				}				
				else
					X=Math.max(m,  X-R);

				ans++;
			}
		}
		System.out.println(ans);
	}
}
