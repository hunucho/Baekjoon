package silver;

import java.util.*;

public class Main_S5_2018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int l=0,r=1, sum=0, ans=0;
		while(r<=n+1) {
			if(sum==n)
				ans++;
			if(sum<n)
				sum+=r++;
			else
				sum-=++l;
		}
		System.out.println(ans);
	}
}
