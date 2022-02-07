package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main_S2_18870 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine()),cnt=0,prev=Integer.MIN_VALUE;
		StringTokenizer st = new StringTokenizer(br.readLine());
		Map<Integer, Integer> dict = new HashMap<Integer, Integer>();
		Set<Integer> set = new HashSet<Integer>();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			set.add(arr[i]);
			dict.put(arr[i], null);
		} 
		Object[] objs = set.toArray();
		Arrays.sort(objs);
		for(int i=0;i<objs.length;i++)
			dict.put((int)objs[i], i);
		
		for(int i=0;i<n;i++)
			bw.write(dict.get(arr[i])+" ");
		bw.close();
	}
}