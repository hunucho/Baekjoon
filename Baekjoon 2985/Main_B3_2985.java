package bronze;

import java.util.*;

public class Main_B3_2985 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
		if(a+b==c)
			System.out.printf("%d+%d=%d",a,b,c);
		else if(a-b==c)
			System.out.printf("%d-%d=%d",a,b,c);
		else if(a*b==c)
			System.out.printf("%d*%d=%d",a,b,c);
		else if(a/b==c)
			System.out.printf("%d/%d=%d",a,b,c);
		else if(a==b+c)
			System.out.printf("%d=%d+%d",a,b,c);
		else if(a==b-c)
			System.out.printf("%d=%d-%d",a,b,c);
		else if(a==b*c)
			System.out.printf("%d=%d*%d",a,b,c);
		else if(a==b/c)
			System.out.printf("%d=%d/%d",a,b,c);
	}
}
