package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_B3_10818 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
		int temp;
		for(int i=0;i<n;i++) {
			temp=Integer.parseInt(st.nextToken());
			if(temp<min)
				min=temp;
			if(temp>max)
				max=temp;
		}
		System.out.println(min+" "+max);
	}

}
