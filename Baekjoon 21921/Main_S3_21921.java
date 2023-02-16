package silver;

import java.io.*;

import java.util.*;

public class Main_S3_21921 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken()), X=Integer.parseInt(st.nextToken()), v=0, d=1, max=0;
		int [] arr = new int[N]
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++)
			arr[i]=Integer.parseInt(st.nextToken());
		for(int i=0;i<X;i++)
			v+=arr[i];
		max=v;
		for(int i=X;i<N;i++) {
			v+=-arr[i-X]+arr[i];
			if(v>max) {
				max=v;
				d=1;
			}
			else if(v==max) {
				d++;
			}
		}
		System.out.println(max==0?"SAD":max+"\n"+d);
	}
}
