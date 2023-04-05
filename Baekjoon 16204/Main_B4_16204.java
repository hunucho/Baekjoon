package bronze;

import java.util.*;

public class Main_B4_16204 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(), M=sc.nextInt(), K=sc.nextInt();
		System.out.println(Math.min(M, K)+Math.min(N-M, N-K));		
	}
}
