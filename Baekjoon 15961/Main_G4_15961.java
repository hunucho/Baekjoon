package gold;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main_G4_15961 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int d=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		int c=Integer.parseInt(st.nextToken());
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
