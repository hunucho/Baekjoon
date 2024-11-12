import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S=br.readLine();
		int ans=1;
		char tmp=S.charAt(0);
		for(int i=1;i<S.length();i++) {
			if(S.charAt(i)!=tmp)
				break;
			else
				ans++;
		}
		System.out.println(ans);
	}
}
