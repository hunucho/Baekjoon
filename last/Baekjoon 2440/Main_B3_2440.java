package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_B3_2440 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}