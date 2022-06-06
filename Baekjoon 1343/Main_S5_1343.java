package silver;

import java.io.*;

public class Main_S5_1343 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		int i=0,j=0, len=str.length();
		while(i<len) {
			if(str.charAt(i)=='X' ) {
				j=0;
				while(i+j<len && str.charAt(i+j)=='X')
					j++;
				if(j%2==1) {
					i=len;
					sb.setLength(0);
					sb.append("-1");
				}
				else {
					sb.append("AAAA".repeat(j/4));
					sb.append("BB".repeat((j%4)/2));
				}
				i+=j;
			}
			else {
				sb.append(".");
				i++;
			}
		}
		System.out.println(sb.toString());
	}
}
