package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_S1_6064 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int tt=0;tt<t;tt++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m=Integer.parseInt(st.nextToken()), n=Integer.parseInt(st.nextToken());
			int x=Integer.parseInt(st.nextToken()), y=Integer.parseInt(st.nextToken());
			int lcm=(m*n)/getLcm(m, n), r=0;
			int ans=-1;
			while(r*m<=lcm) {
				if((r*m+x-y)%n==0) {
					ans=r*m+x;
					break;	
				}								
				r++;				
			}
			System.out.println(ans);
		}
	}
	public static int getLcm(int n1, int n2) {
		if(n1%n2==0)
			return n2;
		else
			return getLcm(n2,n1%n2);
	}
}
