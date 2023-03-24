package bronze;

import java.util.*;

public class Main_B3_12790 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=0;t<T;t++) {
			int [] arr = new int [4];
			for(int i=0;i<2;i++)
				for(int j=0;j<4;j++)
					arr[j]+=sc.nextInt();
			int ans=Math.max(arr[0], 1);
			ans+=Math.max(arr[1], 1)*5;
			ans+=Math.max(arr[2], 0)*2;
			ans+=arr[3]*2;
			System.out.println(ans);
		}
	}
}
