package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_S5_7568 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		int [][] arr = new int [n][2];
		int [] brr=new int[n];
		for(int i=0;i<n;i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		int rank=0;
		for(int i=0;i<n;i++) {
			rank=1;
			for(int j=0;j<n;j++) {
				if(i==j)
					continue;
				if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1])
					rank++;
			}
			brr[i]=rank;
		}
				
		for(int i=0;i<n;i++)
			System.out.print(brr[i]+" ");
	}
}
