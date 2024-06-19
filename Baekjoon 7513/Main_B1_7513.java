import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T=Integer.parseInt(br.readLine());
		for(int t=0;t<T;t++) {
			int m=Integer.parseInt(br.readLine());
			String [] words = new String [m];
			for(int i=0;i<m;i++)
				words[i]=br.readLine();
			sb.append("Scenario #").append(t+1).append(":\n");
			int n=Integer.parseInt(br.readLine());
			for(int i=0;i<n;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int k=Integer.parseInt(st.nextToken());
				for(int j=0;j<k;j++)
					sb.append(words[Integer.parseInt(st.nextToken())]);
				sb.append("\n");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}	
}
