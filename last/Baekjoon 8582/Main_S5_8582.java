import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n=Integer.parseInt(br.readLine()), m=0;
		int [] w = new int [n], arr = new int [n], brr = new int [n];
		for(int i=0;i<n;i++) {
			w[i]=Integer.parseInt(br.readLine());
			m=Math.max(m, w[i]);
			arr[i]=m;
		}
		brr[n-1]=w[n-1];
		for(int i=n-2;i>=0;i--)
			brr[i]=Math.max(brr[i+1], w[i]);
		for(int i=0;i<n;i++)
			sb.append(arr[i]+" "+brr[i]+"\n");
		System.out.println(sb.toString());
	}
}
