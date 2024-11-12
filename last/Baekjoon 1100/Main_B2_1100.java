package bronze;

import java.util.*;

public class Main_B2_1100 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans=0;
		for(int i=0;i<8;i++) {
			String s = sc.next();
			for(int j=0;j<8;j++)
				if((i+j)%2==0 && s.charAt(j)=='F')
					ans++;
		}
		System.out.println(ans);
	}
}
