package silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_S4_2164 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		Queue<Integer> q = new LinkedList<>();
		for(int i=1;i<=n;i++)
			q.add(i);
		while(q.size()>1) {
			q.poll();
			q.add(q.poll());
		}
		System.out.println(q.poll());
	}
}