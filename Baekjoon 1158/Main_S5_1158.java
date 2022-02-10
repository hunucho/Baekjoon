package silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_S5_1158 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt(), k = sc.nextInt();
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 0; i < n; i++)
			q.add(i+1);
		sb.append("<");
		for (int i = 0; i < n; i++) {
			for(int j=0;j<k-1;j++)
				q.add(q.poll());
			sb.append(q.poll()+", ");
		}
		sb.setLength(sb.length()-2);
		sb.append(">");
		System.out.println(sb.toString());
	}
}
