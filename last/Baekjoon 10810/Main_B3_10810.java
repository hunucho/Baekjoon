package bronze;

import java.util.*;

public class Main_B3_10810 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(), M=sc.nextInt();
		int [] arr = new int [N+1];
		for(int t=0;t<M;t++) {
			int i=sc.nextInt(), j=sc.nextInt(), k=sc.nextInt();
			for(int l=i;l<=j;l++)
				arr[l]=k;
		}
		for(int i=1;i<=N;i++)
			System.out.print(arr[i]+" ");
	}
}
