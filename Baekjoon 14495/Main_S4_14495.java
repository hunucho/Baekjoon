import java.util.*;

class Main_S4_14495 {
	static long [] fibo = new long [117];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(f(n));
	}
	
	public static long f(int n) {
		if(fibo[n]!=0)
			return fibo[n];
		if(n<=3) {
			fibo[n]=1;
			return 1;
		}
		else {
			fibo[n]=f(n-1)+f(n-3);
			return fibo[n];
		}
	}
}
