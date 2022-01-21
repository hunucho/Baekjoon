package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_B3_3009 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int [][] arr = new int[2][1001];
		for(int i=0;i<3;i++) {
			st = new StringTokenizer(br.readLine());
			arr[0][Integer.parseInt(st.nextToken())]++;
			arr[1][Integer.parseInt(st.nextToken())]++;
			
		}
		for(int i=1;i<1001;i++)
			if(arr[0][i]==1)
				System.out.print(i+" ");
		for(int i=1;i<1001;i++)
			if(arr[1][i]==1)
				System.out.print(i);
	}
}