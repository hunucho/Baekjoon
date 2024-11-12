import java.util.*;

public class Main_S5_2161 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i=1;i<=n;i++)
			q.add(i);
		for(int i=0;i<n;i++) {
			System.out.print(q.poll()+" ");
			q.add(q.poll());
		}
	}
}
