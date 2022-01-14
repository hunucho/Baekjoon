package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_B5_6749 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int y = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		System.out.println(m+m-y);	
	}
}
