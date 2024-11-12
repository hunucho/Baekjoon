package bronze;

import java.util.*;

public class Main_B4_21591 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int wc=sc.nextInt(), hc=sc.nextInt(), ws=sc.nextInt(), hs=sc.nextInt(), ans=0;
		if(wc>=ws+2 && hc>=hs+2)
			ans=1;
		System.out.println(ans);			
	}
}
