package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_S3_14426 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken()), cnt=0;
		String [] arr = new String [n], brr = new String[m];
		for(int i=0;i<n;i++)
			arr[i]=br.readLine();
		for(int i=0;i<m;i++) {
			String str = br.readLine();
			for(int j=0;j<n;j++)
				if(arr[j].substring(0,str.length()).equals(str)) {
					cnt++;
					break;
				}
		}
		System.out.println(cnt);
	}
}
