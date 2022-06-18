package silver;

import java.io.*;
import java.util.*;

public class Main_S2_16493 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken());
		int [] days = new int[m], pages = new int[m], dp = new int[n+1];
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			days[i]=Integer.parseInt(st.nextToken());
			pages[i]=Integer.parseInt(st.nextToken());
		}
		// i : n일째, dp[i] : i번째 읽을 수 있는 가장 많은 챕터 수
		for(int i=0;i<m;i++) {
			for(int j=n;j>=days[i];j--) {
				dp[j]=Math.max(dp[j], dp[j-days[i]]+pages[i]);	// n일째 읽을 수 있는 최대 페이지 수와, n일에서 현재 페이지를 빠진 날짜 + i번째 책의 페이지수를 계산
			}
		}
		System.out.println(dp[n]);
	}
}
