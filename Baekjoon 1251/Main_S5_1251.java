package silver;

import java.util.*;

public class Main_S5_1251 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ori = sc.nextLine();
		PriorityQueue<String> q = new PriorityQueue<String>();
		int len=ori.length();
		for(int i=1;i<len-1;i++) {
			for(int j=i+1;j<len;j++) {
				StringBuilder sb = new StringBuilder();
				String temp="";
				sb.append(ori.substring(0,i)).reverse();
				temp+=sb.toString();
				sb.setLength(0);
				sb.append(ori.substring(i,j)).reverse();
				temp+=sb.toString();
				sb.setLength(0);
				sb.append(ori.substring(j,len)).reverse();
				temp+=sb.toString();
				q.add(temp);
			}
		}
		System.out.println(q.poll());
	}
}
