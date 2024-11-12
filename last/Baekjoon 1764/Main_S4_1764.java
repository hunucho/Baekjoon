package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main_S4_1764 {

	public static void main(String[] args) throws Exception{
		HashSet<String> hearing = new HashSet<String>();
		HashSet<String> seeing = new HashSet<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n= Integer.parseInt(st.nextToken());
		int m= Integer.parseInt(st.nextToken());
		for(int i=0;i<n;i++)
			hearing.add(br.readLine());
		for(int i=0;i<m;i++)
			seeing.add(br.readLine());
		hearing.retainAll(seeing);
		int length=hearing.size();
		
		String [] arr = new String [length];
		int i=0;
		for(String person:hearing) {
			arr[i++]=person;
		}
		Arrays.sort(arr);
		System.out.println(length);
		for(String person:arr)
			System.out.println(person);
	}

}
