package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_S4_2670 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		double max=0;
		double[] arr = new double [n], dp=new double [n];
		for(int i=0;i<n;i++) {
			arr[i] = Double.parseDouble(br.readLine());
			dp[i]=arr[i];
		}
		for(int i=1;i<n;i++) {
			dp[i]=Math.max(dp[i-1]*dp[i], dp[i]);
			max=Math.max(max, dp[i]);
		}
		System.out.println(String.format("%.3f", max));
	}
}
