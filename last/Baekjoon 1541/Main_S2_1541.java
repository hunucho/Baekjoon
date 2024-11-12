package silver;

import java.util.*;

public class Main_S2_1541 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		int ans=0, tmp=0, prev=1;
		for(int i=0;i<str.length();i++) {
			char cur=str.charAt(i);
			if(cur=='+' || cur=='-') {
				ans+=prev*tmp;
				if(cur=='-')
					prev=-1;				
				tmp=0;
			}				
			else
				tmp=tmp*10 + (cur-'0');
		}
		ans+=prev*tmp;
		System.out.println(ans);
	}
}
