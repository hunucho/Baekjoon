import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
		System.out.println(a*Math.max(b, c)/Math.min(b, c));
	}
}
