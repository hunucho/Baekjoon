import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T=Integer.parseInt(br.readLine());
		for(int t=0;t<T;t++) {
			int n=Integer.parseInt(br.readLine());
			HashMap<String, Integer> key = new HashMap<>();
			String [] str = new String [n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0;i<n;i++)
				key.put(st.nextToken(), i);
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			for(int i=0;i<n;i++) 
				str[key.get(st1.nextToken())] = st2.nextToken();
			for(int i=0;i<n;i++)
				sb.append(str[i]).append(" ");
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
