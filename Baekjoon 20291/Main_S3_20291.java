import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N=Integer.parseInt(br.readLine());
		HashMap<String, Integer> hm = new HashMap<>();
		for(int i=0;i<N;i++) {
			String file=br.readLine(), ext=file.substring(file.indexOf(".")+1);
			hm.put(ext, hm.getOrDefault(ext, 0)+1);
		}
		List<String> keys = new ArrayList<>(hm.keySet());
		Collections.sort(keys);
		for(String key:keys)
			sb.append(key+" "+hm.get(key)+"\n");
		System.out.println(sb);
	}
}
