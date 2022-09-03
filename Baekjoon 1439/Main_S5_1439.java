import java.util.*;

public class Main_S5_1439 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int ans=0;
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)!=str.charAt(i+1)) {
				char tmp=str.charAt(i);
				int j;
				for(j=i+1;j<str.length();j++)
					if(str.charAt(j)==tmp) {
						ans++;
						i=j-1;
						break;
					}
				if(j==str.length())
					ans++;
			}
		}
		System.out.println(ans);
	}
}
