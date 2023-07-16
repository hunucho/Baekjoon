package silver;

import java.io.*;
import java.util.*;

public class Main_S4_26069 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		HashSet<String> hs = new HashSet<String>();
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String A=st.nextToken(), B=st.nextToken();
			if(A.compareTo("ChongChong")==0 || B.compareTo("ChongChong")==0) {
				hs.add(A);
				hs.add(B);
			}
			if(hs.contains(A) || hs.contains(B)) {
				hs.add(A);
				hs.add(B);
			}
		}
		System.out.println(hs.size());
	}
}
