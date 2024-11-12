package bronze;

import java.util.Scanner;

public class Main_B1_1924 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt(), y=sc.nextInt(),cnt=0;
		int [] m= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		String [] d= {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		for(int i=1;i<x;i++)
			cnt+=m[i];
		System.out.println(d[(cnt+y)%7]);
	}
}
