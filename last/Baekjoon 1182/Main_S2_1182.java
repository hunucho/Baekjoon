package silver;

import java.util.*;
import java.io.*;

public class Main_S2_1182 {
	static int n, s, ans;
	static int [] arr;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n=Integer.parseInt(st.nextToken());
		s=Integer.parseInt(st.nextToken());
		arr = new int [n];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++)
			arr[i]=Integer.parseInt(st.nextToken());
		dfs(0,0);
		if(s==0)	// 찾는 값이 0이면 처음 temp값을 0으로 넣기에 공집합이 1개 카운팅된다
			ans--;	// 그래서 -1을 해줌
		System.out.println(ans);
	}
	
	public static void dfs(int d,int temp) {
		if(d==n) {	// 끝까지 계산하고
			if(temp==s)	// 값이 찾는 값과 동일하면 ans++
				ans++;
			return;
		}
		dfs(d+1, temp);	// i번째 원소를 선택안하는 경우
		dfs(d+1, temp+arr[d]);	// i번째 원소를 선택하는 경우
	}
}
