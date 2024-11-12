package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_B2_2908 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a=Integer.parseInt(st.nextToken()), b=Integer.parseInt(st.nextToken()), r_a=0, r_b=0;		// r_a = reversed a
		for(int i=0;i<3;i++) {
			r_a*=10;
			r_a+=a%10;		// using mod for remainder to reverse the value
			a/=10;
			
			r_b*=10;
			r_b+=b%10;
			b/=10;
		}
		System.out.println((r_a<r_b)?r_b:r_a);		// ternary operator 
	}

}
