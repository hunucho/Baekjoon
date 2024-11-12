package bronze;

import java.io.*;
import java.math.*;
import java.util.*;

public class Main_B4_7891 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			BigInteger a=new BigInteger(st.nextToken()), b=new BigInteger(st.nextToken());
			System.out.println(a.add(b));
		}
	}
}
