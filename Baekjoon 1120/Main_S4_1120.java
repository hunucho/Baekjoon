package silver;

import java.util.*;

public class Main_S4_1120 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A=sc.next(), B=sc.next();
		int ans=0;
		if(A.length()==B.length()) {
			for(int i=0;i<A.length();i++)
				if(A.charAt(i)!=B.charAt(i))
					ans++;
		} else {
			ans=99;
			for(int i=0;i<=B.length()-A.length();i++) {
				int tmp=0;
				for(int j=0;j<A.length();j++) {
					if(A.charAt(j)!=B.charAt(i+j))
						tmp++;
				}
				ans=Math.min(ans, tmp);
			}
		}
		System.out.println(ans);
	}
}
