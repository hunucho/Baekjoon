package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_S3_11047 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()), k=Integer.parseInt(st.nextToken()), cnt=0;
		
		int[] coins = new int[n];
		for(int i=0;i<n;i++)
			coins[i]=Integer.parseInt(br.readLine());
		for(int i=n-1;i>=0;i--) {
			if(coins[i]<=k) {
				cnt+=k/coins[i];
				k%=coins[i];
			}
		}
		System.out.println(cnt);
	}
}
