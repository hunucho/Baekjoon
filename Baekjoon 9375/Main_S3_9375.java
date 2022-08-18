import java.io.*;
import java.util.*;

public class Main_S3_9375 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		for(int tc=0;tc<T;tc++) {
			int n=Integer.parseInt(br.readLine()),i, ans=1;
			HashMap<String, Integer> hm = new HashMap<>();
			for(i=0;i<n;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				st.nextToken();
				String tmp=st.nextToken();
				if(hm.get(tmp)==null) 
					hm.put(tmp, 1);
				else
					hm.put(tmp, hm.get(tmp)+1);
			}
			Iterator<Integer> iter = hm.values().iterator();
			while(iter.hasNext())
				ans*=(iter.next()+1);
			System.out.println(ans-1);
		}
	}
}
