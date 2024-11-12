package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_B2_2798 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		int max_sum=0, min_diff=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) 
			arr[i]=Integer.parseInt(st.nextToken());
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					int temp=arr[i]+arr[j]+arr[k];
					if(min_diff>m-temp && temp<=m) {		// 더한 값이 M을 넘으면 안된다!!
						min_diff=m-temp;			// 값의 차가 적은 값을 이용
						max_sum=temp;
						if(min_diff==0)
							break;
					}
				}
			}
		}
		System.out.println(max_sum);
	}
}
