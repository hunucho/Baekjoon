package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main_B1_24383 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> hs = new HashSet<Integer>();
		String str = br.readLine();
		int cnt=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='0')
				cnt++;
			else {
				hs.add(cnt);
				cnt=0;
			}			
		}
		hs.add(cnt);
		hs.remove(0);
		System.out.println(hs.size());
	}
}
