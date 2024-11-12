package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_B3_2446 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++)
				System.out.print(" ");
			for(int j=0;j<n-i-1;j++)
				System.out.print("**");
			System.out.print("*");
			
			
			System.out.println("");
		}
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-2;j++)
				System.out.print(" ");
			for(int j=0;j<i+1;j++)
				System.out.print("**");
			System.out.print("*");
			System.out.println("");
		}
	}
}
