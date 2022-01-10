package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_B2_11720 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum=0;
		String s=br.readLine();
		s=br.readLine();
		for(int i=0;i<s.length();i++) {
			sum+=Integer.parseInt(String.valueOf(s.charAt(i)));
		}
		System.out.println(sum);
	}
}
