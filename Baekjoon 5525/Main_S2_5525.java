package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_S2_5525 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), m = Integer.parseInt(br.readLine()), cnt=0;;
		String str = br.readLine();
		for(int i=0;i<=m-(1+2*n);i++) {
			
			if(str.charAt(i)=='I') {
				int streak=0;
				for(int j=i+1;j<m-1;j+=2) {
					if(str.charAt(j)=='O' && str.charAt(j+1)=='I') {
						streak++;
						i=j-1;
					}
					else
						break;
				}
				if(streak>=n)
					cnt+=streak-n+1;
			}
		}
		System.out.println(cnt);
	}
}
