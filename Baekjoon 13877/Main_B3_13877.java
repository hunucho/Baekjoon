import java.io.*;
import java.util.*;

public class Main_B3_13877 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T=Integer.parseInt(br.readLine());
		for(int t=0;t<T;t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			st.nextToken();
			String n=st.nextToken();
			int oct=n.matches(".*[89].*")?0:Integer.parseInt(n,8);
			int dec=Integer.parseInt(n);
			int hex=Integer.parseInt(n,16);
			sb.append((t+1)+" "+oct+" "+dec+" "+hex+"\n");
		}			
		System.out.println(sb.toString());
	}
}
