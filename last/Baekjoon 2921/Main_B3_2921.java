package bronze;

import java.util.Scanner;

public class Main_B3_2921 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), ans=0;
		for(int i=1;i<=n;i++)
			ans+=((2*i)*(2*i+1)/2-(i)*(i-1)/2);
		System.out.println(ans);
	}
}
