import java.math.*;
import java.util.*;
import java.util.regex.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		String num = "[0-9]*";
		PriorityQueue<BigInteger> pq = new PriorityQueue<>();
		for(int i=0;i<N;i++) {
			String line = sc.next();
			Matcher matcher = Pattern.compile("[0-9]+").matcher(line);
			while(matcher.find())
				pq.add(new BigInteger(matcher.group()));
		}
		while(pq.size()>0)
			System.out.println(pq.poll());
	}
}
