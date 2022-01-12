package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_S4_9012 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++) {
			String s = br.readLine();
			int op=0,cl=0;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(j)=='(')
					op++;
				if(s.charAt(j)==')')
					cl++;
				if(cl>op)		// 닫히는게 열리는 것 보다 많으면 오류임
					break;
			}
			if(cl==op)			// 열림 닫힘 갯수가 같으면 참 -> 오류가 있었으면 이미 위의 for문에서 걸러졌음
				System.out.println("YES");
			else
				System.out.println("NO");
			
		}
	}
}
