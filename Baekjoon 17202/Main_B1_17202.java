package bronze;

import java.util.*;

public class Main_B1_17202 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A=sc.next(), B=sc.next(), C="";
		for(int i=0;i<A.length();i++)
			C+=A.charAt(i)+""+B.charAt(i)+"";
		while(C.length()>2) {
			String D="";
			for(int i=0;i<C.length()-1;i++)
				D+=(char)((((C.charAt(i)-'0')+(C.charAt(i+1)-'0'))%10)+'0');
			C=D;
		}
		System.out.println(C);
	}
}
