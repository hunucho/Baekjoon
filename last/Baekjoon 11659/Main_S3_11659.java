package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_S3_11659 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken());
		int[] arr = new int[n+1];
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			arr[i]+=arr[i-1];
		}
		for(int k=0;k<m;k++) {
			st = new StringTokenizer(br.readLine());
			int i=Integer.parseInt(st.nextToken()), j=Integer.parseInt(st.nextToken());
			bw.write(arr[j]-arr[i-1]+"\n");
		}
		bw.close();
	}
}
