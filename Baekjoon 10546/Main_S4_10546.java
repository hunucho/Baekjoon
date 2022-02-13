package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main_S4_10546 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		HashMap<String, Integer> names = new HashMap<>();
		String str;
		for(int i=0;i<n;i++) {
			str=br.readLine();
			if(names.containsKey(str))
				names.put(str, names.get(str)+1);
			else
				names.put(str, 1);
		}
		for(int i=0;i<n-1;i++) {
			str=br.readLine();
			if(names.get(str)==1)
				names.remove(str);
			else
				names.put(str, names.get(str)-1);
		}
		String[] arr = names.keySet().toArray(new String[names.size()]);
		bw.write(arr[0]);
		bw.close();
	}
}