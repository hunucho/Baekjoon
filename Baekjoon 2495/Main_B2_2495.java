package bronze;

import java.util.Scanner;

public class Main_B2_2495 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int t=0;t<3;t++) {
			String S=sc.next();
			int ans=1, tmp=1;
			char ch=S.charAt(0);
			for(int i=1;i<8;i++) {
				if(ch==S.charAt(i)) {
					tmp++;
				} else {
					ans=Math.max(ans, tmp);
					ch=S.charAt(i);
					tmp=1;
				}
			}
			ans=Math.max(ans, tmp);
			System.out.println(ans);
		}
	}
}
