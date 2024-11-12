import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		long tmp=0;
		for(int i=1;i<=N;i++) {
			long cur=sc.nextLong();
			System.out.print((cur*i)-tmp+" ");
			tmp+=(cur*i)-tmp;
		}
	}	
}
