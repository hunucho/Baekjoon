package bronze;

import java.util.*;

public class Main_B4_10101 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ans="";
		int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(), s=0;
		if(a+b+c!=180)
			ans="Error";
		else if(a==b && b==c)
				ans="Equilateral";
		else if(a==b || b==c || c==a)
			ans="Isosceles";
		else
			ans="Scalene";
		System.out.println(ans);
	}
}
