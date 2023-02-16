package bronze;

import java.util.*;

public class Main_B3_6321 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			String str = sc.next();
			sb.append("String #"+i+"\n");
			for(int j=0;j<str.length();j++)
				sb.append((char)((str.charAt(j)-'A'+1)%26+'A'));
			sb.append("\n\n");
		}
		System.out.println(sb.toString());
	}
}
