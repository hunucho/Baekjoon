package bronze;

import java.io.*;
import java.util.*;

public class Main_B3_2712 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double kg=2.2046, lb=0.4536, l=0.2642, g=3.7854;
		int T=Integer.parseInt(br.readLine());
		for(int t=0;t<T;t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double n=Double.parseDouble(st.nextToken()), ans=0;
			String u=st.nextToken(), str="";
			if(u.equals("kg")) {
				ans=n*kg;
				str="lb";
			}
			else if(u.equals("lb")) {
				ans=n*lb;
				str="kg";
			}
			else if(u.equals("l")) {
				ans=n*l;
				str="g";
			}
			else if(u.equals("g")) {
				ans=n*g;
				str="l";
			}
			System.out.printf("%.4f %s\n",ans,str);
		}
	}
}
