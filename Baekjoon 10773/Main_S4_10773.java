package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main_S4_10773 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		Integer sum=0;
		Stack<Integer> s= new Stack<>();
		
		for(int i=0;i<k;i++) {
			int temp=Integer.parseInt(br.readLine());
			if(temp==0)
				s.pop();
			else
				s.add(temp);
		}
		
		while(!s.empty()) {
			sum+=s.pop();
		}
		System.out.println(sum);
	}

}
