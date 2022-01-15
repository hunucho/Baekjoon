package bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_B2_15552 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t=Integer.parseInt(br.readLine());
		
		for(int i=1;i<=t;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken()), b=Integer.parseInt(st.nextToken());
			bw.write("Case #"+i+": ");
			bw.write(a+" + "+b+" = ");
			bw.write(a+b+"\n");
		}
		bw.flush();
	}
}
