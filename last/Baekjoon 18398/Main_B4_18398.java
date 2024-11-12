import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=0;t<T;t++) {
			int N=sc.nextInt();
			for(int j=0;j<N;j++) {
				int A=sc.nextInt(), B=sc.nextInt();
				System.out.println(A+B+" "+A*B);
			}
		}
	}
}
