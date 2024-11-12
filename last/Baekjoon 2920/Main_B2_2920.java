package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_B2_2920 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int prev=Integer.parseInt(st.nextToken()), now=0;
		for(int i=0;i<7;i++ ) {
			now=Integer.parseInt(st.nextToken());
			if(Math.abs(prev - now)!=1) {		// whether the value of difference is 1 
				System.out.println("mixed");
				return;
			}
			prev=now;
		}
		if(now==8) {
			System.out.println("ascending");
		}
		else
			System.out.println("descending");
	}

}
