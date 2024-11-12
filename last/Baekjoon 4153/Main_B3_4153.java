package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_B3_4153 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if(a+b+c==0)
				return;
			a=(int)Math.pow(a, 2);
			b=(int)Math.pow(b, 2);
			c=(int)Math.pow(c, 2);
			if(a+b==c || b+c==a||a+c==b)
				System.out.println("right");
			else
				System.out.println("wrong");
			
		}
	}

}
