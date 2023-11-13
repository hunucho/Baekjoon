import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(), A=0, B=0;
		int [] x = new int[N], y = new int[N];
		long min = Long.MAX_VALUE;
		for(int i=0;i<N;i++) {
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
		}
		
		for(int a=1;a<=100;a++) {
			for(int b=1;b<=100;b++) {
				long RSS=0;
				for(int i=0;i<N;i++)
					RSS+=Math.pow(y[i]-(a*x[i]+b), 2);
				if(min>RSS) {
					min=RSS;
					A=a;
					B=b;
				}
			}				
		}
		System.out.println(A+" "+B);
	}
}
