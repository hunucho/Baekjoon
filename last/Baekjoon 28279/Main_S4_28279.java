import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		StringBuilder sb = new StringBuilder();
		int N=sc.nextInt();
		for(int i=0;i<N;i++) {
			int cmd=sc.nextInt();
			switch(cmd) {
			case 1:dq.addFirst(sc.nextInt()); break;
			case 2:dq.addLast(sc.nextInt()); break;
			case 3:sb.append(dq.size()>0?dq.pollFirst():-1); break;
			case 4:sb.append(dq.size()>0?dq.pollLast():-1); break;
			case 5:sb.append(dq.size()); break;
			case 6:sb.append(dq.isEmpty()?1:0); break;
			case 7:sb.append(dq.size()>0?dq.peekFirst():-1); break;
			case 8:sb.append(dq.size()>0?dq.peekLast():-1); break;
			}
			if(cmd>2)
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
