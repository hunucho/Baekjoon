package bronze;

import java.io.*;
import java.util.*;

public class Main_B1_19575 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()), x=Integer.parseInt(st.nextToken());
		long ans=0;
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			ans+=Integer.parseInt(st.nextToken());
			ans*=x;
			ans%=(1000000007);
		}
		st = new StringTokenizer(br.readLine());
		ans+=Integer.parseInt(st.nextToken());
		System.out.println(ans);
	}
}
