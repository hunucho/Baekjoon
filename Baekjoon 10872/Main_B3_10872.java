package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_B3_10872 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		Main_B3_10872 m= new Main_B3_10872();
		System.out.println(m.factorial(n));
		
	}
	public int factorial(int a) {
		if(a<=0)
			return 1;
		return a*factorial(a-1);
	}

}
