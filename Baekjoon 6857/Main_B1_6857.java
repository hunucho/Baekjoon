import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] num = new int [] {1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,4,1,2,3,1,2,3,4};
		int [] pos = new int [] {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
		while(true) {
			String S=sc.next();
			if(S.equals("halt"))
				break;
			int ans=num[S.charAt(0)-'a'];
			for(int i=1;i<S.length();i++) {
				if(pos[S.charAt(i-1)-'a']==pos[S.charAt(i)-'a'])
					ans+=2;
				ans+=num[S.charAt(i)-'a'];
			}
			System.out.println(ans);
		}
	}
}
