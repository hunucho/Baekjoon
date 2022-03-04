package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main_S4_4949 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			String str = br.readLine();
			if(str.length()==1 && str.equals("."))
				break;
			Stack<Character> s = new Stack<Character>();
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)=='(') 
					s.push(str.charAt(i));
				else if(str.charAt(i)=='[')
					s.push(str.charAt(i));
				else if(str.charAt(i)==')' || str.charAt(i)==']')
				{
					if(s.size()==0)
						s.add(str.charAt(i));
					else if(str.charAt(i)==')' && s.peek()=='(')
						s.pop();
					else if(str.charAt(i)==']' && s.peek()=='[')
						s.pop();					
				}
			}
			if(s.size()==0)
				bw.write("yes\n");
			else
				bw.write("no\n");
		}
		bw.close();
	}
}
