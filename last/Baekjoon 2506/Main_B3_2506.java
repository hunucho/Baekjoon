package bronze;

import java.util.*;

public class Main_B3_2506 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), ans=0, con=1;
		for(int i=0;i<n;i++) {
			int temp=sc.nextInt();
			if(temp==1)
				ans+=con++;
			else
				con=1;
		}
		System.out.println(ans);
	}
}
