import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), w=sc.nextInt(), L=sc.nextInt();
		int weight=0, ans=0;
		Queue<Integer> trucks = new LinkedList<Integer>(), bridge = new LinkedList<Integer>();
		for(int i=0;i<n;i++)
			trucks.add(sc.nextInt());
		for(int i=0;i<w;i++)
			bridge.add(0);
		while(bridge.size()>0) {
			ans++;
			weight-=bridge.poll();
			if(!trucks.isEmpty()) {
				if(weight+trucks.peek()>L)
					bridge.add(0);
				else {
					weight+=trucks.peek();
					bridge.add(trucks.poll());
				}
			}
		}
		System.out.println(ans);
	}
}
