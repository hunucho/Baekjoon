package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main_S5_11651 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =  new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0;i<n;i++) {
			arr.add(new ArrayList<>());
			st = new StringTokenizer(br.readLine());
			arr.get(i).add(Integer.parseInt(st.nextToken()));
			arr.get(i).add(Integer.parseInt(st.nextToken()));
		}
					
		Collections.sort(arr, new Comparator<ArrayList<Integer>>() {
			@Override
			public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
				if(o1.get(1).compareTo(o2.get(1))==0)
					return o1.get(0).compareTo(o2.get(0));
				else
					return o1.get(1).compareTo(o2.get(1));
			}
		});
				
		for(int i=0;i<n;i++)
			System.out.println(arr.get(i).get(0)+" "+arr.get(i).get(1));
		
	}
}
