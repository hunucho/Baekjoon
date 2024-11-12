package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.regex.Pattern;

public class Main_S3_9996 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		String pt = "^("+str.substring(0,str.indexOf('*'))+").*("+str.substring(str.indexOf('*')+1,str.length())+")$";
		// ^(a).*(d)$
		for(int t=0;t<n;t++) {			
			if(Pattern.matches(pt, br.readLine()))
				bw.write("DA\n");
			else
				bw.write("NE\n");
		}
		bw.close();
	}
}
