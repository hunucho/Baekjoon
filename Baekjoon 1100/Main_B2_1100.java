package bronze;

import java.io.*;

public class Main_B2_1100 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean w=true;
		int ans=0;
		for(int i=0;i<8;i++, w=!w) {
			String str = br.readLine();
			for(int j=0;j<8;j++, w=!w)
				if(str.charAt(j)=='F' && w)
					ans++;
		}
		System.out.println(ans);
	}
}
