import java.io.*;
import java.util.*;

public class Main {
	static int [] num;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int N=Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken());
		num = new int [N+1];
		for(int i=0;i<=N;i++)
			num[i] = i;
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int oper = Integer.parseInt(st.nextToken()), a = Integer.parseInt(st.nextToken()), b=Integer.parseInt(st.nextToken());
			// 합치기
			if(oper==0) {
				union(a, b);
			}
			// 같은 집합인지 확인하기
			else if(oper==1) {
				sb.append(find(a)==find(b)?"YES":"NO").append("\n");
			}
		}
		System.out.println(sb);
	}
	
	static int find (int x) {
		int ret=-1;
		if(num[x]==x)
			return x;

		ret = find(num[x]);
		num[x]=ret;
		return ret;
	}
	
	static void union (int x, int y) {
		int px = find(x);
		int py = find(y);
		if(px==py)
			return;
		num[py]=px;
	}
}
