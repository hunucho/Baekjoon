package bronze;

import java.io.*;
import java.util.*;

public class Main_B2_5355 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n= Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double ans=Double.parseDouble(st.nextToken());
			while(st.hasMoreTokens()) {
				char ch=st.nextToken().charAt(0);
				if(ch=='@')
					ans*=3;
				else if(ch=='%')
					ans+=5;
				else if(ch=='#')
					ans-=7;
			}
			bw.write(String.format("%.2f", ans)+"\n");
		}
		bw.close();
	}
}
