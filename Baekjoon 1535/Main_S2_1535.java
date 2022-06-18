package silver;

import java.io.*;
import java.util.*;

public class Main_S2_1535 {
	// DP
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int [] l = new int[n], g = new int[n], dp = new int[100];	// Lose, Get, DP 배열
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++)
			l[i]=Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++)
			g[i]=Integer.parseInt(st.nextToken());
		// i : 사용 체력에 따른 최대 값
		// dp[i] : 해당 체력에서 얻을 수 있는 최대 행복값
		for(int i=0;i<n;i++) {	// 현재 있는 사람의 값으로 경우의 수를 계산
			for(int j=99;j>=l[i];j--) {	// 현재 있는 사람의 잃는 체력을 기준으로 하나씩 감소해가면서 현재 사람으로 시작하는 경우까지 탐색
				dp[j]=Math.max(dp[j], dp[j-l[i]]+g[i]);	// 현재 체력과 현재 체력에서 감소해가며 현재 사람을 이용하여 얻을 수 있는 값 중 큰 값을 저장 
			}
		}
		System.out.println(dp[99]);	// 사용 체력이 100일때는 0을 출력하기에, 99까지 밖에 출력을 하지 못함
		// 99에 저장되어있는 최대행복 값을 출력
	}
	
	/*
	백트래킹
	static int ans, n;
	static int [][] people;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		people = new int [n][2];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++)
			people[i][0]=Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++)
			people[i][1]=Integer.parseInt(st.nextToken());
		dfs(0, 0, 0);
		System.out.println(ans);
	}
	static public void dfs(int s, int sumh, int sump) {
		if(sumh>=100)	// 소모 체력이 100이상이면 조건에 맞지 않기에 리턴
			return;	
		if(sump>ans)	// 얻은 행복이 ans보다 크다면 ans를 갱신
			ans=sump;
		if(s==n)	// 선택한 사람이 마지막 사람이면 리턴
			return;
		dfs(s+1,sumh+people[s][0],sump+people[s][1]);	// 현재 사람을 선택한 경우
		dfs(s+1,sumh,sump);	// 현재 사람을 선택하지 않은 경우
	}
	*/
}
