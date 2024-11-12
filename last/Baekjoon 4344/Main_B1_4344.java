package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_B1_4344 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c=Integer.parseInt(br.readLine());
		for(int i=0;i<c;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken());
			int[] arr=new int[1000];
			float avg=0;
			for(int j=0;j<n;j++) {
				arr[j]=Integer.parseInt(st.nextToken());
				avg+=arr[j];
			}
			avg/=n;
			int cnt=0;
			for(int j=0;j<n;j++) {
				if(arr[j]>avg) {
					cnt++;
				}
			}
			System.out.println(String.format("%.3f", (float) cnt/n*100)+"%");
		}
	}
}

