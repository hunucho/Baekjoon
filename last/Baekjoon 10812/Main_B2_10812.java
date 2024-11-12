package bronze;

import java.io.*;
import java.util.*;

public class Main_B2_10812 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken());
		int [] arr = new int [N+1];
		for(int i=1;i<=N;i++)
			arr[i]=i;
		for(int t=0;t<M;t++) {
			st=new StringTokenizer(br.readLine());
			int I=Integer.parseInt(st.nextToken()), J=Integer.parseInt(st.nextToken()), K=Integer.parseInt(st.nextToken()), pos=I;
			int [] brr = Arrays.copyOf(arr, N+1);
			for(int i=K;i<=J;i++)
				brr[pos++]=arr[i];
			for(int i=I;i<K;i++)
				brr[pos++]=arr[i];
			arr=Arrays.copyOf(brr, N+1);
		}
		for(int i=1;i<=N;i++)
			System.out.print(arr[i]+" ");
	}
}
