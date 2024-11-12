import java.io.*;
import java.util.*;

public class Main_S5_7785 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()), i;
		HashSet<String> hs = new HashSet<>();
		for(i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name=st.nextToken();
			if(hs.contains(name))
				hs.remove(name);
			else
				hs.add(name);
		}
		String [] arr = new String [hs.size()];
		i=0;
		for(String ele:hs)
			arr[i++]=ele;
		Arrays.sort(arr);
		for(i=hs.size()-1;i>=0;i--)
			System.out.println(arr[i]);
	}
}
