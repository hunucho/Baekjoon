package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_S4_10816 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int [] arr = new int [20000005];
		for(int i=0;i<n;i++) {
			int temp =Integer.parseInt(st.nextToken()); 
			if(temp<0)
				temp=temp*-1 + 10000000;
			arr[temp]++;
		}
					
		int m=Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<m;i++) {
			int temp=Integer.parseInt(st.nextToken());
			if(temp<0)
				temp=temp*-1+10000000;
			bw.write(String.valueOf(arr[temp])+" ");			
		}
		bw.flush();
		bw.close();
	}

}
