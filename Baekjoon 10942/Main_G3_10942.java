package gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_G3_10942 {	
	// 기본적인 팰린드롬 구분법으로 수행
	static int [] arr;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		arr = new int [n+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=1;i<=n;i++)
			arr[i]=Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(br.readLine());
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int s=Integer.parseInt(st.nextToken()), e = Integer.parseInt(st.nextToken());
			sb.append(isPalin(s, e)+"\n");
		}
		System.out.println(sb.toString());
	}
	
	static int isPalin(int s, int e) {
		for(int i=0;i<e-s;i++) {
			if(arr[s+i]!=arr[e-i])
				return 0;
		}
		return 1;
	}
	
}
