package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_B3_2739 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i=1;i<=9;i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
	}

}
