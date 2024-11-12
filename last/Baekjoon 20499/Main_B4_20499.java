package bronze;

import java.io.*;
import java.util.*;

public class Main_B4_20499 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(),"/");
		int K=Integer.parseInt(st.nextToken()), D=Integer.parseInt(st.nextToken()), A=Integer.parseInt(st.nextToken());
		String ans="gosu";
		if(K+A<D || D==0)
			ans="hasu";
		System.out.println(ans);		
	}
}
