import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(), d=sc.nextInt(), e=a*d+b*c, f=b*d;
        int gcd=gcd(e,f);
        e/=gcd;
        f/=gcd;
        gcd=gcd(e,f);
        System.out.println(e/gcd+" "+f/gcd);
    }
    public static int gcd(int a, int b) {
		int c=0;
		if(b>a) {
			c=a;
			a=b;
			b=c;
		}
		while(b>0) {
			c=a%b;
			a=b;
			b=c;
		}
		return a;
	}
}
