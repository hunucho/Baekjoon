package bronze;

import java.io.*;
import java.util.*;

public class Main_B1_12605 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N=Integer.parseInt(br.readLine());
		for(int n=1;n<=N;n++) {
			String tmp = "";
			StringTokenizer st = new StringTokenizer(br.readLine());
			sb.append("Case #"+n+":");
			while(st.hasMoreTokens())
				tmp=" "+st.nextToken()+tmp;
			sb.append(tmp.toString()+"\n");
		}
		System.out.println(sb.toString());
	}
}
