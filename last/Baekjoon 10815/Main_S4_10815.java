package silver;

import java.io.*;
import java.util.*;

public class Main_S4_10815 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		HashSet<String> hs = new HashSet<String>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++)
			hs.add(st.nextToken());
		int m= Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<m;i++)
			bw.write(hs.contains(st.nextToken())?"1 ":"0 ");
		bw.close();
	}
}
