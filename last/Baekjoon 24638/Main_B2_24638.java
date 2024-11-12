package bronze;

import java.util.Scanner;

public class Main_B2_24638 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a=sc.next(),b=sc.next(),c=sc.next(),d=sc.next();
		int x=0, y=0;
		if(a.equals("AD"))
			x=Integer.parseInt(b)-1;
		else if(b.equals("BC"))
			x=Integer.parseInt(a)*-1;
		if(c.equals("AD")) 
			y=Integer.parseInt(d)-1;
		else if(d.equals("BC"))
			y=Integer.parseInt(c)*-1;
		System.out.println(Math.abs(x-y));
	}
}
