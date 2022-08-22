package bronze;

import java.util.Scanner;

public class Main_B1_24416 {
	static int cnt1, cnt2;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		fib(n);
		fibonacci(n);
		System.out.print(cnt1+" "+cnt2);
	}
	
	public static int fib(int n) {
		if(n==1 || n==2) {
			cnt1++;
			return 1;
		}
		return fib(n-1)+fib(n-2);
	}
	
	public static int fibonacci(int n) {
		int [] f=new int[50];
		f[1]=f[2]=1;
		for(int i=3;i<=n;i++) {
			f[i]=f[i-1]+f[i-2];
			cnt2++;
		}
		return f[n];
	}
}
