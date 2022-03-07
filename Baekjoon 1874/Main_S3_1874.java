package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_S3_1874 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> s = new Stack<Integer>();
		int n = Integer.parseInt(br.readLine()), cnt=1;
		for(int i=1;i<=n;i++) {
			int k=Integer.parseInt(br.readLine());
			if(k<cnt && s.peek()!=k) {
				System.out.println("NO");
				return;
			}
			if(k>=cnt) {
				while(cnt<=k && k<=n) {
					s.push(cnt++);
					sb.append("+\n");
				}
			}
			if(s.peek()==k) {
				s.pop();
				sb.append("-\n");
			}				
		}
		System.out.println(sb.toString());
	}
}
