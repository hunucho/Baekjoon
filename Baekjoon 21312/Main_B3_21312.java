package bronze;

import java.util.*;

public class Main_B3_21312 {
	static int odd=0, even=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt(), B=sc.nextInt(), C=sc.nextInt();
		F(A);
		F(B);
		F(C);
		F(A*B);
		F(B*C);
		F(A*B*C);
		if(odd==0)
			System.out.println(even);
		else
			System.out.println(odd);
	}
	public static void F(int tmp) {
		if(tmp%2==0)
			even=Math.max(even, tmp);
		if(tmp%2==1)
			odd=Math.max(odd, tmp);
	}
}
