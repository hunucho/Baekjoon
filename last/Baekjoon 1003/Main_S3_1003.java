package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_S3_1003 {

	static public int fibonacci(int n) {
		if (n == 0) {
			System.out.println("0");
			return 0;
		} else if (n == 1) {
			System.out.println("1");
			return 1;
		} else {
			return fibonacci(n‐1) + fibonacci(n‐2);
		}
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int m=2;
		int[][] arr=new int[50][2];
		arr[0][0]= 1;
		arr[1][1]= 1;
		for(int i=0;i<t;i++) {
			int n=Integer.parseInt(br.readLine());
			if(arr[n][0]==0 && arr[n][1]==0) {
				for(int j=m;j<=n;j++) {
					arr[j][0]+=arr[j-1][0]+arr[j-2][0];
					arr[j][1]+=arr[j-1][1]+arr[j-2][1];
				}
				m=n+1;
				System.out.println(arr[n][0]+" "+arr[n][1]);
			}
			else
				System.out.println(arr[n][0]+" "+arr[n][1]);
		}
	}
}
