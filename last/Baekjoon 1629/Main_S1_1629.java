package silver;

import java.util.Scanner;

public class Main_S1_1629 {
	static long f(long a, long b,long c) {
		if(b==1)
			return a;
		else {
			long x=f(a,b/2,c);
			if(b%2==0)
				return ((x*x)%c)%c;
			else
				return ((x*x)%c*a)%c;
		}
	}
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		long a=sc.nextLong(), b=sc.nextLong(), c=sc.nextLong();
		System.out.println(f(a,b,c)%c);
	}
}
