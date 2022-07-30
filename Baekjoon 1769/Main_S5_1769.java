package silver;

import java.io.*;

public class Main_S5_1769 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x = br.readLine(), ans="NO";
		int tmp=0, cnt=0, y=0;
		for(int i=0;i<x.length();i++)
			tmp+=x.charAt(i)-'0';
		if(tmp<10 && tmp%3==0)
			ans="YES";
		else if(tmp>9) {
			cnt=1;
			while(tmp>9) {	
				cnt++;
				y=0;
				while(tmp>0) {
					y+=tmp%10;
					tmp/=10;
				}
				tmp=y;
			}
			if(tmp%3==0)
				ans="YES";			
		}
		System.out.println(cnt+"\n"+ans);
	}
}
