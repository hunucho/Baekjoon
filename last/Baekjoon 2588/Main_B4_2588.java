package bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_B4_2588 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine()), b = Integer.parseInt(br.readLine());
		int c=a*b;
		for(int i=0;i<3;i++) {
			bw.write(a*(b%10)+"\n");
			b/=10;
		}
		bw.write(String.valueOf(c));
		bw.flush();
		bw.close();
	}

}
