import java.util.*;

public class Main_S5_9625 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K=sc.nextInt();
		int a=1, b=0, c=0;
		for(int i=0;i<K;i++) {
			c=b;
			b+=a;
			a=c;
		}
		System.out.println(a+" "+b);			
	}
}
