package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_B5_2475 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int temp,temp_sum=0;
		for(int i=0;i<5;i++) {
			temp = Integer.parseInt(st.nextToken());
			temp_sum+=temp*temp;
		}
		System.out.println(temp_sum%10);
	}

}
