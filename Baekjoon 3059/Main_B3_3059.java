package bronze;

import java.util.*;

public class Main_B3_3059 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=0;t<T;t++) {
			int ans=0;
			boolean [] chk = new boolean[26];
			String s = sc.next();
			for(int i=0;i<s.length();i++)
				chk[s.charAt(i)-'A']=true;
			for(int i=0;i<26;i++)
				if(!chk[i])
					ans+=65+i;
			System.out.println(ans);
		}
	}
}
