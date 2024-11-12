package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_B1_1032 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		char []cmp = new char[55];
		cmp=br.readLine().toCharArray();
		for(int i=1;i<n;i++) {
			String str = br.readLine();
			for(int j=0;j<str.length();j++) {
				if(cmp[j]!=str.charAt(j)) {
					cmp[j]='?';
				}
			}
		}
		for(int i=0;i<cmp.length;i++)
			System.out.print(cmp[i]);
	}
}
