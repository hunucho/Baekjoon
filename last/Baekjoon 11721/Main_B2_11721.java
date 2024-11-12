package bronze;

import java.io.*;

public class Main_B2_11721 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		for(int i=1;i<=s.length()/10+1;i++)
			System.out.println(s.substring((i-1)*10, Math.min(i*10, s.length())));
	}
}
