package gold;

import java.io.*;
import java.util.*;

public class Main_G5_2467 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int [] arr = new int [n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++)
			arr[i]=Integer.parseInt(st.nextToken());
		int ansl=0, ansr=n-1;
		int l=0, r=n-1, dif=Math.abs(arr[l]+arr[r]);
		while(l<r) {
			if(Math.abs(arr[l+1]+arr[r])>Math.abs(arr[l]+arr[r-1]))
				r--;
			else
				l++;
			if(dif>=Math.abs(arr[l]+arr[r]) && l<r) {
				dif=Math.abs(arr[l]+arr[r]);
				ansl=l;
				ansr=r;
			}
			if(dif==0)
				break;				
		}
		System.out.print(arr[ansl]+" "+arr[ansr]);
	}
}
