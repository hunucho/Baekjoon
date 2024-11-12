package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_B4_2753 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		if(n%400==0 || (n%100!=0 && n%4==0))
			System.out.println(1);
		else
			System.out.println(0);
	}

}
