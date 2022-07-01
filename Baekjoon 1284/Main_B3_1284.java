package bronze;

import java.util.*;

public class Main_B3_1284 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int temp=sc.nextInt(), ans=1;
			if(temp==0)
				break;
			while(temp>0) {
				if(temp%10==0)
					ans+=4;
				else if(temp%10==1)
					ans+=2;
				else
					ans+=3;
				temp/=10;
				ans++;
			}
			System.out.println(ans);
		}
	}
}
