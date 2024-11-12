import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int INF = 1000000007;
		long N=sc.nextInt(), ans=0, prev=0, m;
		for(int i=1;i<N;i++) {
			m = sc.nextInt();
			prev = ((prev+1)*m)%INF;
			ans = (ans+prev)%INF;
		}
		System.out.println(ans);
	}
}
