package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_S4_13305 {
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long [] dist = new long[n+1], gas = new long[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=1;i<n;i++)
			dist[i]=Long.parseLong(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++)
			gas[i]=Long.parseLong(st.nextToken());
		int cheap=0;
		long ans=dist[1]*gas[cheap];
		for(int i=1;i<n;i++) {
			if(gas[cheap]>gas[i])
				cheap=i;
			ans+=dist[i+1]*gas[cheap];
		}
		System.out.println(ans);
	}
}
