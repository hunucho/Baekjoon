package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_B5_1009 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader bs = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bs.readLine());
		for(int i=0;i<T;i++) {
			StringTokenizer st = new StringTokenizer(bs.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c=a;
			for(int j=0;j<b-1;j++) {
				c=c*a;			// pow is unacceptable, cuz of overflow
				c%=10;			// a^b => it can be an overflow
			}
			c%=10;				// If a=30, b=1, then answer will be 30
			if(c==0)
				System.out.println(10);
			else
				System.out.println(c);			
		}
	}
}