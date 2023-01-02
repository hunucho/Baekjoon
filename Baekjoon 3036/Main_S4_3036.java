import java.util.*;

public class Main_S4_3036 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), a=sc.nextInt();
		for(int i=0;i<n-1;i++) {
			int b=sc.nextInt(), c=gcd(a,b);
			System.out.println(a/c+"/"+b/c);
		}
	}
	
	public static int gcd(int a, int b) {
		if(b==0)
			return a;
		return gcd(b,a%b);
	}
}
