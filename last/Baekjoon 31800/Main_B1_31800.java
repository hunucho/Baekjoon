import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		StringTokenizer st1 = new StringTokenizer(br.readLine()), st2 = new StringTokenizer(br.readLine());
		int [] profit = new int [N], price = new int [N], opportunity = new int [N], net = new int [N], sortProfit = new int [N];
		StringBuilder sb = new StringBuilder();
		int max=0;
		for(int i=0;i<N;i++) {
			profit[i] = Integer.parseInt(st1.nextToken());
			max=Math.max(max, profit[i]);
			sortProfit[i] = profit[i];
			price[i] = Integer.parseInt(st2.nextToken());
		}
		Arrays.sort(sortProfit);
		for(int i=0;i<N;i++) {
			if(profit[i]==max)
				opportunity[i] = profit[i]-sortProfit[N-2];
			else
				opportunity[i] = profit[i]-max;
			sb.append(opportunity[i]).append(" ");
		}
		System.out.println(sb.toString());
	}
}
