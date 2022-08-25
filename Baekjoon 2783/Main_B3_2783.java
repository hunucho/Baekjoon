package bronze;

import java.io.*;
import java.util.*;

public class Main_B3_2783 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double x=Double.parseDouble(st.nextToken()), y=Double.parseDouble(st.nextToken());
		int n=Integer.parseInt(br.readLine());
		double S=1000/y*x;
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			x=Double.parseDouble(st.nextToken());
			y=Double.parseDouble(st.nextToken());
			if(1000/y*x<S)
				S=1000/y*x;
		}
		System.out.println(Math.round(S*100)/100.0);
	}
}
