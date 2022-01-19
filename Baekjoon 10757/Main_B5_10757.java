package bronze;

import java.util.Scanner;

public class Main_B5_10757 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a,b,c="";
		a=sc.next();
		b=sc.next();
		StringBuffer sb = new StringBuffer(a);
		a=sb.reverse().toString();
		sb = new StringBuffer(b);
		b=sb.reverse().toString();
		int temp=0;
		int inta=0, intb = 0;
		for(int i=0;i<Math.max(a.length(), b.length());i++) {
			if(i<a.length())
				inta = a.charAt(i)-'0';
			if(i<b.length())
				intb = b.charAt(i)-'0';
			temp += inta+intb;
			c+=String.valueOf(temp%10);
			temp/=10;
			inta=intb=0;
		}
		if(temp>0)
			c+=String.valueOf(1);
		sb = new StringBuffer(c);
		c=sb.reverse().toString();
		System.out.println(c);
	}
}
