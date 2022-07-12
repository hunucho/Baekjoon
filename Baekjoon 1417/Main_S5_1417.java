package silver;

import java.io.*;
import java.util.*;

public class Main_S5_1417 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
		int d=Integer.parseInt(br.readLine()), ans=0;
		for(int i=1;i<n;i++)
			q.add(Integer.parseInt(br.readLine()));
		while(q.size()>0 && q.peek()>=d) {
			ans++;
			d++;
			q.add(q.poll()-1);
		}
		System.out.println(ans);
			
	}
}
