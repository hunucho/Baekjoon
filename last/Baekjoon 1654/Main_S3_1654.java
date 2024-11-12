package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_S3_1654 {
	
	public static int cut(int[]cables, long length)
	{
		int cnt=0;
		for(int cable:cables) {
			cnt+=cable/length;
		}
		return cnt;
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k=Integer.parseInt(st.nextToken()), n=Integer.parseInt(st.nextToken());
		int [] cables = new int[k];
		long s=0, e=0, m=(s+e)/2;
		for(int i=0;i<k;i++) {
			cables[i]=Integer.parseInt(br.readLine());
			if(e<cables[i])
				e=cables[i];
		}
		
		e++;
		
		while(s<e) {
			m=(s+e)/2;
			int cnt = cut(cables, m);
			if(cnt<n)
				e=m;
			else
				s=m+1;
		}
		System.out.println(s-1);
	}
}
