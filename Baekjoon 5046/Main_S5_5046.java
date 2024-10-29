import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken()), B=Integer.parseInt(st.nextToken()), H=Integer.parseInt(st.nextToken()), W=Integer.parseInt(st.nextToken());
		int ans=Integer.MAX_VALUE;
		for(int i=0;i<H;i++) {
			int p = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<W;j++) {
				int a=Integer.parseInt(st.nextToken());
				if(a>=N && p*N<=B)
					ans = Math.min(ans, p*N);
			}
		}
		System.out.println(ans==Integer.MAX_VALUE?"stay home":ans);
	}
}
