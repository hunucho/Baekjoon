package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_S1_1992 {
	static StringBuilder sb = new StringBuilder();
	public static void quad(boolean [][] map, int n, int x, int y) {
		int cnt0=0, cnt1=0;
		for(int i=x;i<x+n;i++) {
			for(int j=y;j<y+n;j++)
				if(map[i][j])
					cnt1++;
				else
					cnt0++;
		}
		if(cnt1==n*n)
			sb.append("1");
		else if(cnt0==n*n)
			sb.append("0");
		else {
			sb.append("(");
			quad(map,n/2, x, y);
			quad(map,n/2, x, y+n/2);
			quad(map,n/2, x+n/2, y);
			quad(map,n/2, x+n/2, y+n/2);
			sb.append(")");
		}			
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		boolean [][] map=new boolean[n][n];
		for(int i=0;i<n;i++) {
			String str = br.readLine();
			for(int j=0;j<n;j++)
				if(str.charAt(j)=='1')
					map[i][j]=true;
		}
		quad(map,n,0,0);
		System.out.println(sb.toString());
	}
}
