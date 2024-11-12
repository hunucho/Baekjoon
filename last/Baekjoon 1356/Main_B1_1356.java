package bronze;

import java.util.*;

public class Main_B1_1356 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr=sc.next(),ans="NO";
		int len=arr.length();
		if(len>1) {
			for(int i=1;i<len;i++) {
				int a=1, b=1;
				for(int j=0;j<i;j++)
					a*=(arr.charAt(j)-'0');
				for(int j=i;j<len;j++)
					b*=(arr.charAt(j)-'0');
				if(a==b) {
					ans="YES";
					break;
				}
			}
		}
		System.out.println(ans);	
	}
}
