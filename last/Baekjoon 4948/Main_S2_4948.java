package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_S2_4948 {
	static boolean [] isNotPrime=new boolean [333333];
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		prime();
		while(true) {
			int n = Integer.parseInt(br.readLine()), ans=0;
			if(n==0)
				break;
			for(int i=n+1;i<=2*n;i++) {
				if(!isNotPrime[i])
					ans++;
			}			
			bw.write(ans+"\n");
		}
		bw.close();
	}
	
	static void prime() {
		isNotPrime[1]=true;
		for(int i=2;i<=333332;i++) {
			boolean chk=false;
			for(int j=2;j*j<=i;j++) {
				if(i%j==0) {
					chk=true;
					break;
				}
			}
			isNotPrime[i]=chk;
		}
	}
}
