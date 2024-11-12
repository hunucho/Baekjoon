package bronze;

import java.util.*;

public class Main_B2_1362 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt=1;
		while(true) {
			String ans="";
			int o=sc.nextInt(), w=sc.nextInt();
			if(o==0 && w==0)
				break;
			while(true) {
				String str = sc.next();
				int n=sc.nextInt();
				if(str.equals("#"))
					break;
				if(str.equals("F"))
					w+=n;
				if(str.equals("E"))
					w-=n;
				if(w<=0)
					ans="RIP";
			}
			if(o/2<w && w<2*o && !ans.equals("RIP"))
				ans=":-)";
			else if (!ans.equals("RIP"))
				ans=":-(";
			System.out.println((cnt++)+" "+ans);
		}
	}
}
