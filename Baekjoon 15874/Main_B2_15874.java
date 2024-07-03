import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int k = Integer.parseInt(st.nextToken())%26, s = Integer.parseInt(st.nextToken());
		String S=br.readLine();
		for(char ch : S.toCharArray()) {
			if(Character.isLowerCase(ch)) {
				sb.append((char)((ch-'a'+k)%26+'a'));
			} else if(Character.isUpperCase(ch)) {
				sb.append((char)((ch-'A'+k)%26+'A'));
			} else
				sb.append(ch);
		}
		System.out.println(sb);
		
	}
}
