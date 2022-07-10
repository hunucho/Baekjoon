package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_B2_11719 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while(true) {
			str=br.readLine();
			if(str!=null)
				System.out.println(str);
			else
				break;
		}
	}
}
