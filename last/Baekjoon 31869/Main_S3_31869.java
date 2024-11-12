import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		HashMap<String, Integer> ppl = new HashMap<>(), money = new HashMap<>();
		boolean [] lunch = new boolean [100];
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String S = st.nextToken();
			int W = Integer.parseInt(st.nextToken()), D = Integer.parseInt(st.nextToken()), P = Integer.parseInt(st.nextToken());
			ppl.put(S, (W-1)*7+D);
			money.put(S, P);
		}
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String S = st.nextToken();
			int M=Integer.parseInt(st.nextToken());
			if(money.get(S)<=M) {
				int day=ppl.get(S);
				lunch[day]=true;
			}
		}
		int ans=0, cont=0;
		for(int i=0;i<100;i++) {
			if(lunch[i]) {
				cont++;
				ans=Math.max(ans, cont);
			} else {
				ans=Math.max(ans, cont);
				cont=0;
			}
		}
		System.out.println(ans);
	}
}
