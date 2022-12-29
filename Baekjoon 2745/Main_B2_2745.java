package bronze;

import java.util.*;

public class Main_B2_2745 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N=sc.next();
		int B=sc.nextInt(),r=1, ans=0;
		for(int i=N.length()-1;i>=0;i--) {
			if(N.charAt(i)>=0 && N.charAt(i)<=9)
				ans+=(N.charAt(i)-'0')*r;
			else
				ans+=(N.charAt(i)-'A'+10)*r;
			r*=B;
		}
		System.out.println(ans);
	}
}
