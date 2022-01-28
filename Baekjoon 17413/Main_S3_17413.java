package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main_S3_17413 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine().toString();
		String tmp = "";
		boolean open = false;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '>') {
				open = false;
				bw.write(s.charAt(i));
			} else if (open || s.charAt(i) == '<') {
				if(tmp.length()>0) {
					for (int j = tmp.length() - 1; j >= 0; j--)
						bw.write(tmp.charAt(j));
					tmp="";
				}
//					bw.write(s.charAt(i));
				open = true;
				bw.write(s.charAt(i));
			} else if (s.charAt(i) != ' ') {
				tmp += s.charAt(i);
			} else {
				for (int j = tmp.length() - 1; j >= 0; j--)
					bw.write(tmp.charAt(j));
				bw.write(s.charAt(i));
				tmp = "";
			}
		}
		for (int j = tmp.length() - 1; j >= 0; j--)
			bw.write(tmp.charAt(j));
		bw.close();

	}

}
