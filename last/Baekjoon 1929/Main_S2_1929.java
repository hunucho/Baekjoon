package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_S2_1929 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m=Integer.parseInt(st.nextToken()), n=Integer.parseInt(st.nextToken());
		if(m==1)
			m=2;
		for(int i=m;i<=n;i++) {
			boolean chk=true;
			for(int j=2;j<=Math.pow(i, 0.5);j++) {
				if(i%j==0) {
					chk=false;
					break;
				}
			}
			if(chk)
				System.out.println(i);			
		}
	}
}
