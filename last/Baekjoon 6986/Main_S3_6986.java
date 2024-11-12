import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(), K=sc.nextInt();
		double [] scores = new double [N];
		for(int i=0;i<N;i++)
			scores[i]=sc.nextDouble();
		Arrays.sort(scores);
		double trimmed = 0, modiffed = 0;
		for(int i=K;i<N-K;i++)
			trimmed+=scores[i];
		System.out.printf("%.2f\n",trimmed/(N-2*K));
		modiffed = trimmed + scores[K]*K + scores[N-K-1] * K;
		System.out.printf("%.2f",modiffed/N);
	}
}
