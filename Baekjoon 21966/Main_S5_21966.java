package silver;

import java.io.*;

public class Main_S5_21966 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n=Integer.parseInt(br.readLine());
		String s=br.readLine();
		if(n<=25) {
			sb.append(s);
		}
		else {
			String t=s.substring(12,n-12);
			if(t.indexOf('.')==-1)
				sb.append(s.substring(0,11)+"..."+s.substring(n-11));
			else
				sb.append(s.substring(0,9)+"......"+s.substring(n-10));
		}
		System.out.println(sb.toString());
	}
}
