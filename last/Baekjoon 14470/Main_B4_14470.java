package bronze;

import java.util.*;

public class Main_B4_14470 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt(), B=sc.nextInt(), C=sc.nextInt(), D=sc.nextInt(), E=sc.nextInt(), ans=0;
		if(A<0)
			ans+=A*(-C)+D+E*B;
		else
			ans+=E*(B-A);
		System.out.println(ans);
	}
}
