import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		int[] coins = new int[n], values = new int[10001];
		Arrays.fill(values, 99999);
		for (int i = 0; i < n; i++) {
			coins[i] = Integer.parseInt(br.readLine());
			if (coins[i] > 10000)
				coins[i] = 0;
			values[coins[i]] = 1;
		}
		
		for(int coin:coins) {
			for(int i=1;i<=k;i++)
				if(i-coin>0)
					values[i]=Math.min(values[i], values[i-coin]+1);
		}
		System.out.println(values[k]==99999?-1:values[k]);
	}
}
