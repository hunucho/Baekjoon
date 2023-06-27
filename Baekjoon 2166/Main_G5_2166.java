package gold;

import java.util.*;

public class Main_G5_2166 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		double ans=0;
		long [][] arr = new long [N][2];
		for(int i=0;i<N;i++) {
			arr[i][0]=sc.nextInt();
			arr[i][1]=sc.nextInt();
		}
		for(int i=0;i<N;i++) {
			ans+=arr[i][0]*arr[(i+1)%N][1];
			ans-=arr[i][1]*arr[(i+1)%N][0];
		}
		System.out.printf("%.1f",Math.abs(ans)/2);
	}
}
