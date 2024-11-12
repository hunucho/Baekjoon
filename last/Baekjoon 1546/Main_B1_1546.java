package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_B1_1546 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		float[] arr=new float[1000];
		float temp_sum=0;
		int max=0;
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			int temp = Integer.parseInt(st.nextToken());
			arr[i]=temp;
			if(temp>max)
				max=temp;
		}
		for(int i=0;i<n;i++) {
			arr[i]=arr[i]/max*100;
			temp_sum+=arr[i];
		}
		System.out.println(temp_sum/n);
	}

}
