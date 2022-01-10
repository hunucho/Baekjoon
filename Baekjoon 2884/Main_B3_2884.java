package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_B3_2884 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int in_h=Integer.parseInt(st.nextToken()), in_m=Integer.parseInt(st.nextToken());
		int out_h=in_h, out_m=in_m;
		if(in_m-45<0) {
			out_m=60+in_m-45;
			out_h--;
		}
		else
			out_m=in_m-45;
		if(out_h==-1)
			out_h=23;
		System.out.println(out_h+" "+out_m);
	}
}
