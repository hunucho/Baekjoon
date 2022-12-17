package silver;

import java.util.*;

public class Main_S4_1302 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),max=0;
		String tmp="",ans="";
		Map<String, Integer> hm = new HashMap<String, Integer>();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			tmp = sc.nextLine();
			if(hm.containsKey(tmp))
				hm.put(tmp, hm.get(tmp)+1);
			else
				hm.put(tmp, 1);
		}
		ArrayList<String> al = new ArrayList<String>(hm.keySet());
		Collections.sort(al);
		for(String s : al) {
			if(hm.get(s)>max) {
				max=hm.get(s);
				ans=s;
			}
		}
		System.out.println(ans);
	}
}
