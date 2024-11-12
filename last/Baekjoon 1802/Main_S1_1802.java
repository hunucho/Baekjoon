import java.io.*;
import java.util.*;

class Main {
	static String str;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int t=0;t<T;t++) {
			str = br.readLine();
			System.out.println(fold(0, str.length())?"YES":"NO");
		}
	}
	
	static boolean fold(int start, int end) {
		if(start+1==end)
			return true;
		int mid = (start+end)/2;
		for(int i=start;i<mid;i++)
			if(str.charAt(i)==str.charAt(end-1-i))
				return false;
		return fold(start, mid) && fold(mid+1, end);
	}
}
