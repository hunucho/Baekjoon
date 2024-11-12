package silver;

import java.io.*;
import java.util.*;

public class Main_S5_16173 {
	static int n;
	static int [][] arr;
	static boolean [][] chk; // 메모리 문제!!! 방문처리를 안해주면 메모리 오류가 뜬다
	static String ans="Hing";
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		chk = new boolean[n][n];
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<n;j++)
				arr[i][j]=Integer.parseInt(st.nextToken());
		}
		dfs(0,0);	// dfs를 재귀 형태로 호출
		System.out.println(ans);
	}
	public static void dfs(int x, int y) {
		if(x>=n || x<0 || y>=n || y<0)	// 범위를 벗어나면 return으로 탐색 종료 
			return;
		if(chk[x][y])	// 이미 방문했다면 재방문 하지 않음
			return;
		if(arr[x][y]==-1) {	// 현재 위치가 -1이면 마지막 위치에 도달한 것이므로 HaruHaru를 출력
			ans="HaruHaru";
			return;
		}
		chk[x][y]=true;	// 방문처리
		dfs(x+arr[x][y], y);	// x축을 증가하는 탐색
		dfs(x, y+arr[x][y]);	// y출을 증가하는 탐색
	}
}
