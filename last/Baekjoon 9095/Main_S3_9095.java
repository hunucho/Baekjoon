package silver;

import java.util.Scanner;

public class Main_S3_9095 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int [] arr = new int[] {0,1,2,4,0,0,0,0,0,0,0,0,0}; 
		for(int test_case=0;test_case<t;test_case++) {
			int n=sc.nextInt();
			for(int i=4;i<=n;i++)
				arr[i]=arr[i-1]+arr[i-2]+arr[i-3];
			System.out.println(arr[n]);
		}
	}
}
