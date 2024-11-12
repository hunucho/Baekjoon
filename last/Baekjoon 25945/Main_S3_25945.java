import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()), m=0, avg=0, ans1=0, ans2=0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int [] arr = new int [n];
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			m+=arr[i];
		}
		Arrays.sort(arr);
		avg = m/n;
		for(int i=0;i<n;i++) {
			if(arr[i]<avg) 
				ans1+=avg-arr[i];
			else if(arr[i]>avg)
				ans2+=arr[i]-avg-1;
		}
		System.out.println(Math.max(ans1, ans2));
	}
}
