package silver;

import java.util.*;

public class Main_S4_3986 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(), ans=0;
		for(int i=0;i<N;i++) {
			String S=sc.next();
			if(S.length()%2==1)
				continue;
			Stack<Character> stk = new Stack<Character>();
			for(char c: S.toCharArray()) {
				if(!stk.empty() && c==stk.peek())
					stk.pop();
				else
					stk.push(c);
			}
			if(stk.size()==0)
				ans++;
		}
		System.out.println(ans);
	}
}
