package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_S5_10867 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean [] arr = new boolean [2010];
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++)
			arr[Integer.parseInt(st.nextToken())+1000]=true;
		for(int i=0;i<arr.length;i++)
			if(arr[i]==true)
				bw.write(i-1000+" ");
		bw.close();
	}
}
