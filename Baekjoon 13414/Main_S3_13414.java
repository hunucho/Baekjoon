import java.io.*; 
import java.util.*;
	
class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int K = Integer.parseInt(st.nextToken()), L = Integer.parseInt(st.nextToken());
		LinkedHashSet<String> hs = new LinkedHashSet<>();
		int order = 1;
		for(int i=0;i<L;i++) {
			String tmp = br.readLine();
			if(hs.contains(tmp))
				hs.remove(tmp);
			hs.add(tmp);
		}
		for(String tmp : hs) {
			if(K==0)
				break;
			sb.append(tmp).append("\n");
			K--;
		}
		System.out.println(sb);		
	}
}
