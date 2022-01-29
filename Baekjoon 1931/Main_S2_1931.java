package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main_S2_1931 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int[][]arr = new int[n][2];
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0]=Integer.parseInt(st.nextToken());
			arr[i][1]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr, new Comparator<int[]>() {
			public int compare(int[]a, int[]b) {
				if(a[1]==b[1])
					return a[0]-b[0];
				return a[1]-b[1];
			}
		});
		int cnt=1,endtime=arr[0][1];
		for(int i=1;i<n;i++) {
			if(arr[i][0]==arr[i][1])
				cnt++;
			else if(arr[i][0]>=endtime) {
				cnt++;
				endtime=arr[i][1];
			}
		}
		System.out.println(cnt);
	}
}