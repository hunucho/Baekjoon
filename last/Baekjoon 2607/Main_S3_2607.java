package silver;

import java.io.*;

public class Main_S3_2607 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()), cnt=0;
		String ori = br.readLine();
		int [] arr = new int [26];
		for(int i=0;i<ori.length();i++)
			arr[ori.charAt(i)-'A']++;
		for(int i=1;i<n;i++) {
			String temp = br.readLine();
			int [] brr = new int[26];
			for(int j=0;j<temp.length();j++)
				brr[temp.charAt(j)-'A']++;
			int tmp=0;
			for(int j=0;j<26;j++)
				tmp+=Math.abs(arr[j]-brr[j]);
			if(temp.length()==ori.length() && tmp<=2)
				cnt++;
			else if(Math.abs(temp.length()-ori.length())==1 && tmp==1 )
				cnt++;
		}
		System.out.println(cnt);
	}
}
