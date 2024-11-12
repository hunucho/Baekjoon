import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int N=sc.nextInt();
		for(int i=0;i<N;i++) {
			int cmd=sc.nextInt();
			switch(cmd) {
			case 1:st.add(sc.nextInt()); break;
			case 2:sb.append((st.isEmpty()?-1:st.pop())+"\n"); break;
			case 3:sb.append(st.size()+"\n"); break;
			case 4:sb.append((st.isEmpty()?1:0)+"\n"); break;
			case 5:sb.append((st.isEmpty()?-1:st.peek())+"\n");
			}
		}
		System.out.println(sb.toString());
	}
}
