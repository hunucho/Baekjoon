package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_B3_10250 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		for(int i=0;i<t;i++) {
			st = new StringTokenizer(br.readLine());
			int h=Integer.parseInt(st.nextToken()), n=Integer.parseInt(st.nextToken());
			int x=0, y=0;
			x=n/h;
			y=n%h;
			if(y==0) {
				y=h;
				x--;
			}
			System.out.println(y+String.format("%02d", x+1));
		}
	}

}
