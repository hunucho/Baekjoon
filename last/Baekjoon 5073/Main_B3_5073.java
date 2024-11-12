package bronze;

import java.util.*;

public class Main_B3_5073 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int [] a=new int [] {sc.nextInt(), sc.nextInt(), sc.nextInt()};
			Arrays.sort(a);
			String s;
			if(a[2]==0)
				break;
			if(a[0]+a[1]<=a[2])
				s="Invalid";
			else if(a[0]==a[1] && a[1]==a[2])
				s="Equilateral";
			else if(a[0]==a[1] || a[1]==a[2])
				s="Isosceles";
			else
				s="Scalene";
			System.out.println(s);
			System.out.println(a[0]+" "+a[2]);
		}
	}
}
