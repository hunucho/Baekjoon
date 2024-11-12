package bronze;

import java.io.*;
import java.util.*;

public class Main_B1_23882 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n=Integer.parseInt(st.nextToken()), k=Integer.parseInt(st.nextToken()), cnt=0;
		int [] A = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++)
			A[i]=Integer.parseInt(st.nextToken());
		
		for(int i=n-1;i>=0;i--) {
			int max=0, idx=0;
			for(int j=0;j<i;j++) {
				if(max<A[j]) {
					max=A[j];
					idx=j;
				}
			}
			if(A[i]<A[idx]) {
				int temp = A[i];
				A[i]=A[idx];
				A[idx]=temp;
				cnt++;
			}			
			if(cnt==k)
				break;
		}
		if(cnt<k)
			System.out.println(-1);
		else {
			for(int i=0;i<n;i++)
				sb.append(A[i]+" ");
			System.out.println(sb.toString());
		}
	}
}
