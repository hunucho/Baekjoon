package silver;

import java.io.*;

public class Main_S3_3613 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		boolean isC=false, isJ=false, err=false;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
				isJ=true;
			if(s.charAt(i)=='_')
				isC=true;
			if(!(Character.isLetter(s.charAt(i)) || s.charAt(i)=='_')) {
				err=true;
				break;
			}
		}
		if(Character.isUpperCase(s.charAt(0)) || isJ && isC || s.charAt(s.length()-1)=='_' || s.charAt(0)=='_' || s.contains("__") ||  err)
			sb.append("Error!");
		else if(isC) {
			for(int i=0;i<s.length();i++)
				if(s.charAt(i)=='_')
					sb.append((char)(s.charAt(++i)-'a'+'A'));
				else
					sb.append(s.charAt(i));
		}
		else {
			for(int i=0;i<s.length();i++)
				if(s.charAt(i)>='A' && s.charAt(i)<='Z')
					sb.append("_"+(char)(s.charAt(i)-'A'+'a'));
				else
					sb.append(s.charAt(i));
		}
		System.out.println(sb.toString());
			
	}
}
