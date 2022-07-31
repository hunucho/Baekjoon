package bronze;

import java.io.*;
import java.util.*;

public class Main_B1_23969 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken()), k=Integer.parseInt(st.nextToken()), cnt=0;
		int [] a = new int [n];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++)
			a[i]=Integer.parseInt(st.nextToken());
		for(int i=n-1;i>0;i--) {
			for(int j=0;j<=i-1 && cnt<k;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					cnt++;
				}
			}
		}
		if(cnt<k)
			sb.append("-1");
		else
			for(int i=0;i<n;i++)
				sb.append(a[i]+" ");
		System.out.println(sb.toString());
	}
}
