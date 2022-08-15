package silver;

import java.io.*;
import java.util.*;

public class Main_S4_1049 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken());
		int pack=9999, piece=9999, ans;
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int tmp1=Integer.parseInt(st.nextToken()), tmp2=Integer.parseInt(st.nextToken());
			if(pack>tmp1)
				pack=tmp1;
			if(piece>tmp2)
				piece=tmp2;
		}
		if(n%6==0)
			ans=n/6*pack;
		else
			ans=((n/6)+1)*pack;
		ans=Math.min(ans,Math.min((n/6)*pack+(n%6)*piece, n*piece));
		System.out.println(ans);
	}
}
