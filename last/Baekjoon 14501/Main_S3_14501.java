package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main_S3_14501 {
	
	// Brute force
//	static int ans, tmp,n;
//	static boolean [] chk;
//	public static void main(String[] args) throws Exception{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		n= Integer.parseInt(br.readLine());
//		Consult [] consult = new Consult[n];
//		for(int i=0;i<n;i++) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			consult[i] = new Consult(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
//		}
//		work(consult,0);
//		System.out.println(ans);	
//	}
//	
//	static void work(Consult [] consult, int cur) {
//		for(int i=cur;i<n;i++) {
//			if(i+consult[i].t<=n) {
//				tmp+=consult[i].p;
//				work(consult, i+consult[i].t);
//				tmp-=consult[i].p;
//			}
//		}
//		if(tmp>ans)
//			ans=tmp;
//	}
//	
//	static class Consult{
//		int t, p;
//
//		public Consult(int t, int p) {
//			this.t = t;
//			this.p = p;
//		}		
//	}
	
	// Dynamic Programming
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		int [] dp =new int[21];	// 입력받는 N의 최대 갯수는 15, T의 최대값은 5 => 20일까지 일하기 가능
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int t = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			// 이전 값을 들고와서 현재 들어온 값을 이용하지 않는다면 이전까지의 금액이 최대 금액
			dp[i+1]=Math.max(dp[i], dp[i+1]);
			// 돈은 일이 끝난뒤에 추가되기에, 끝나는 날짜를 기준으로 일을 완료했다고 생각한다
			// 이미 입력된 금액과, 현재 날짜 + 추가된 금액 중에서 더 큰 값을 저장해 놓는다 
			dp[i+t]=Math.max(dp[i+t],  dp[i]+p);
		}
		System.out.println(dp[n]);
		
	}
}
