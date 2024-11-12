package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_S3_2805 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken());
		int [] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		int s=0, e=0;
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			if(e<arr[i])
				e=arr[i];
		}
		Arrays.sort(arr);
		
		while(s<e) {
			int height = (s+e)/2;
			long temp=0;
			for(int i=0;i<n;i++) {
				if(arr[i]-height>0)
					temp+=arr[i]-height;
			}			
			if(temp<m)
				e=height;
			else
				s=height+1;
		}
		System.out.println(s-1);
	}
}