package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_B3_1267 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m=0, y=0;
		int calling;
		StringTokenizer st = new StringTokenizer(br.readLine());	// first line doesn't have token
		for(int i=0;i<n;i++) {
			calling=Integer.parseInt(st.nextToken());	//read next line, separate to tokens
			y+=(calling/30)*10;				// quotient * 30 is Y's normal price 
			if(calling-calling/30!=0)		// if there is a remainder
				y+=10;						// It also needs to be charged
			m+=(calling/60)*15;
			if(calling-calling/60!=0)
				m+=15;
		}
		if(m<y)
			System.out.println("M " + m);
		else if(m>y)
			System.out.println("Y " + y);
		else
			System.out.println("Y M "+m);
	}

}
