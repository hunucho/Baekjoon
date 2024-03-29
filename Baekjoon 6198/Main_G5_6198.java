import java.io.*;
import java.util.*;

class Main {
	static String str;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long ans=0;
		Stack<Integer> S = new Stack<>();
		for(int i=0;i<N;i++) {
			int H = Integer.parseInt(br.readLine());
			if(S.isEmpty()) {
				S.add(H);
				continue;	
			}
			while(!S.isEmpty() && S.peek()<=H)
				S.pop();
			ans+=S.size();
			S.add(H);				
		}
		System.out.println(ans);			
	}
}
