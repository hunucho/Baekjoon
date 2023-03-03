package silver;

import java.io.*;
import java.util.*;

public class Main_S4_18110 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()), m=(int)Math.ceil(n*0.15), ans=0;
		int [] arr = new int [n];
		for(int i=0;i<n;i++)
			arr[i]=Integer.parseInt(br.readLine());
		Arrays.sort(arr);
		if(n<=3) {
			for(int i=0;i<n;i++)
				ans+=arr[i];
			ans=(int)Math.round(1.0*ans/n);
		} else {
			for(int i=m;i<n-m;i++)
				ans+=arr[i];
			ans=(int)Math.round(1.0*ans/(n-2*m));
		}
		System.out.println(ans);
	}
}
