import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
		int T = Integer.parseInt(br.readLine());
		for(int t=1;t<=T;t++) {
			int N=Integer.parseInt(br.readLine());
			int [] arr = new int [N];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0;i<N;i++)
				arr[i] = Integer.parseInt(st.nextToken());
			N--;
			while(N>=2) {
				for(int i=0;i<=N/2;i++) {
					arr[i] = arr[i]+arr[N-i];
				}
				N = (int)Math.ceil(N/2);
			}
			System.out.println("Case #"+t+": "+(arr[0]>arr[1]?"Alice":"Bob"));
		}
	}
}
