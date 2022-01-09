package Bronze;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_B3_1085 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader bs = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bs.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int min_x=min_v(x,w);
		int min_y=min_v(y,h);
		System.out.println(Math.min(min_x, min_y));
	}
	public static int min_v(int a, int b) {
		if(b-a<a)		// calculate min distance between x to 0 and x to w
			return b-a;
		return a;
	}

}
