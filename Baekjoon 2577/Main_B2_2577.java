package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_B2_2577 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum=1,temp;
		int[] arr = new int[10];
		for(int i=0;i<3;i++) {
			temp = Integer.parseInt(br.readLine());
			sum*=temp;
		}
		while(sum>0) {
			arr[sum%10]++;
			sum/=10;
		}
		for(int i=0;i<10;i++)
			System.out.println(arr[i]);
	}

}
