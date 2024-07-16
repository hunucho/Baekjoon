import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T=1;
		while(true) {
			int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
			double ans = 0;
			if(a==b && b==c && c==0)
				break;
			System.out.printf("Triangle #%d\n",T++);
			if(c==-1)
				ans=Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
			else
				ans=Math.sqrt(Math.pow(c, 2) - Math.pow(Math.max(a, b), 2));
			
			
			System.out.printf(Double.isNaN(ans)||ans<=0 ?"Impossible.\n\n":"%c = %.3f\n\n", a==-1?'a':b==-1?'b':'c', ans);
		}
	}
}
