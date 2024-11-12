package bronze;

import java.util.*;

public class Main_B3_15633 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), ans=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				ans+=i;
		}
		System.out.println(5*ans-24);
	}
}
