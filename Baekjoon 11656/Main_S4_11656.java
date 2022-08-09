package silver;

import java.util.*;

public class Main_S4_11656 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		String [] S = new String [s.length()];
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++)
			S[i]=s.substring(i);
		Arrays.sort(S);
		for(int i=0;i<S.length;i++)
			sb.append(S[i]+"\n");
		System.out.println(sb.toString());
	}
}
