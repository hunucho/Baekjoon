package bronze;

import java.util.*;

public class Main_B2_13420 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			long a=sc.nextLong();
			String op=sc.next();
			long b=sc.nextLong();
			String t=sc.next();
			long c=sc.nextLong();
			long ans=0;
			if(op.equals("+"))
				ans=a+b;
			else if(op.equals("-"))
				ans=a-b;
			else if(op.equals("*"))
				ans=a*b;
			else if(op.equals("/"))
				ans=a/b;
			t=ans==c?"correct":"wrong answer";
			System.out.println(t);
		}
	}
}
