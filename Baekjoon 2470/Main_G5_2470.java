package gold;

import java.io.*;
import java.util.*;

public class Main_G5_2470 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()), ans=Integer.MAX_VALUE, anss=0, anse=0;
		int [] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++)
			arr[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		int s=0, e=n-1;
		while(s<e) {
			if(Math.abs(arr[e]+arr[s])<Math.abs(ans)) {
				ans=arr[e]+arr[s];
				anss=arr[s];
				anse=arr[e];
			}
			else if(arr[e]+arr[s]>0)
				e--;
			else
				s++;			
		}
		System.out.println(anss+" "+anse);
	}
}
