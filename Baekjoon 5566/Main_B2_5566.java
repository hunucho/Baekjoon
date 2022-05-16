package bronze;

import java.io.*;
import java.util.*;

public class Main_B2_5566 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken()), ans=0, loc=0;
		int [] map = new int[n];
		for(int i=0;i<n;i++)
			map[i] = Integer.parseInt(br.readLine());
		for(int i=0;i<m;i++) {
			int dice = Integer.parseInt(br.readLine());
			ans++;
			loc+=dice;
			if(loc>=n)
				break;
			loc+=map[loc];
			if(loc>=n)
				break;
		}
		System.out.println(ans);
	}
}
