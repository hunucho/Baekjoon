package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_B2_1668 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int [] arr = new int[n];
		int max=0, cnt=0;
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]>max)
				cnt++;
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println(cnt);
		max=cnt=0;
		for(int i=n-1;i>=0;i--) {
			if(arr[i]>max)
				cnt++;
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println(cnt);
	}
}
