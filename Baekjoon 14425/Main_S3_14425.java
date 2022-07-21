import java.io.*;
import java.util.*;

public class Main_S2_9020 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken()), ans=0;
		HashSet<String> hs = new HashSet<>();
		for(int i=0;i<n;i++)
			hs.add(br.readLine());
		
		for(int i=0;i<m;i++) {
			String tmp=br.readLine();
			if(hs.contains(tmp))
				ans++;
		}
		System.out.println(ans);
	}
}
