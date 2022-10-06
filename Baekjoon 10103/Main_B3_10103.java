import java.util.*;

public class Main_B3_10103 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), a=100, b=100, c, d;
		for(int i=0;i<n;i++) {
			c=sc.nextInt();
			d=sc.nextInt();
			if(c>d)
				b-=c;
			if(c<d)
				a-=d;
		}
		System.out.println(a+"\n"+b);
	}
}
