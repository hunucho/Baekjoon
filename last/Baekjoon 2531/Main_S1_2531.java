package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main_S1_2531 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());	// 접시 수
		int d=Integer.parseInt(st.nextToken()); // 초밥 종류
		int k=Integer.parseInt(st.nextToken()); // 연속 먹는 접시 수
		int c=Integer.parseInt(st.nextToken()); // 쿠폰 번호
		int [] belt = new int[n];
		int max=0;
		Map<Integer, Integer> ht = new HashMap<Integer, Integer>();
		for(int i=0;i<n;i++) {
			belt[i]=Integer.parseInt(br.readLine());
		}
		ht.put(c, 1);
		for(int i=0;i<k;i++)
		{
			if(ht.get(belt[i])==null)
				ht.put(belt[i], 1);
			else
				ht.put(belt[i], ht.get(belt[i])+1);
		}
		max=ht.size();
		for(int i=0;i<n;i++) {
			if(ht.get(belt[i])==1)
				ht.remove(belt[i]);
			else
				ht.put(belt[i], ht.get(belt[i])-1);
			
			if(ht.get(belt[(i+k)%n])==null)
				ht.put(belt[(i+k)%n], 1);
			else
				ht.put(belt[(i+k)%n], ht.get(belt[(i+k)%n])+1);
			max = Math.max(max, ht.size());
		}
		
		System.out.println(max);
	}
}
