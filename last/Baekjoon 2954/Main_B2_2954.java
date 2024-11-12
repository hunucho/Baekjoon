import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String[] C = {"a","e","i","o","u"};
		while(st.hasMoreTokens()) {
			String str = st.nextToken();
			for(int i=0;i<5;i++)
				str = str.replaceAll(C[i]+"p"+C[i], C[i]);
			System.out.print(str+" ");
		}
	}
}
