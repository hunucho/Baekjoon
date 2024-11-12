import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N=Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken());
		
		HashMap<String, Integer> hm = new HashMap<>();
		for(int i=0;i<N;i++) {
			String tmp = br.readLine();
			if(tmp.length()<M)
				continue;
			hm.put(tmp, hm.getOrDefault(tmp, 0)+1);			
		}
		
		List<Map.Entry<String, Integer>> list = new ArrayList<>(hm.entrySet());
		list.sort((o1,o2)->{
			if(o1.getValue() != o2.getValue()) {
				return o2.getValue()-o1.getValue();
			} else {
				if(o1.getKey().length() != o2.getKey().length()) {
					return o2.getKey().length()-o1.getKey().length();
				} else {
					return o1.getKey().compareTo(o2.getKey());
				}
			}
		});
		
		for(int i=0;i<list.size();i++)
			bw.append(list.get(i).getKey()+"\n");		
		bw.close();
	}
}
