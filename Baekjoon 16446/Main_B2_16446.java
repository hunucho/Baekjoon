package bronze;

import java.util.*;

public class Main_B2_16446 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(), cmp=sc.nextLine();
		int slen=str.length(), clen=cmp.length(), ans=0;
		for(int i=0;i<=slen-clen;i++) {
			boolean chk=true;
			for(int j=0;j<clen;j++) {
				if(str.charAt(i+j)==cmp.charAt(j)) {
					chk=false;
					break;
				}
			}
			if(chk)
				ans++;
		}
		System.out.println(ans);
	}
}
