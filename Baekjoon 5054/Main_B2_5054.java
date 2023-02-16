package bronze;

import java.util.Scanner;

public class Main_B2_5054 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=0;t<T;t++) {
			int n=sc.nextInt(), m=0, ans=0,min=100, max=0;
			int [] arr = new int [n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
				max=Math.max(max, arr[i]);
				min=Math.min(min, arr[i]);
				m+=arr[i];
			}
			m/=n;
			ans+=Math.abs(m-min)+Math.abs(m-max);
			System.out.println(ans);
		}
	}
}
