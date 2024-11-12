package bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_B1_3412 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int tc=Integer.parseInt(br.readLine());
		for(int t=0;t<tc;t++) {
			int n=Integer.parseInt(br.readLine()), ans=0;
			for(int i=0;i<n;i++)
			{
				StringTokenizer st= new StringTokenizer(br.readLine());
				int a=Integer.parseInt(st.nextToken()), b=Integer.parseInt(st.nextToken());
				double r = Math.sqrt(a*a+b*b);
				for(int j=1;j<=10;j++) {
					if(r<=20*j) {
						ans+=11-j;
						break;
					}
				}
			}
			bw.write(ans+"\n");
		}
		bw.close();
	}
}
