package bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_B2_13300 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()), k=Integer.parseInt(st.nextToken()), cnt=0;
		int [] boy=new int [7], girl = new int[7];
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			if(Integer.parseInt(st.nextToken())==0)
				girl[Integer.parseInt(st.nextToken())]++;
			else
				boy[Integer.parseInt(st.nextToken())]++;
		}
		for(int i=1;i<=6;i++) {
			if(boy[i]%k!=0)
				cnt++;
			cnt+=boy[i]/k;
			
			if(girl[i]%k!=0)
				cnt++;
			cnt+=girl[i]/k;
		}
		System.out.println(cnt);
	}
}
