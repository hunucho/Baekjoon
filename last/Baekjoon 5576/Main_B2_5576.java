package bronze;

import java.util.*;

public class Main_B2_5576 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] W = new int [10], K = new int [10];
		int w=0, k=0;
		for(int i=0;i<10;i++)
			W[i]=sc.nextInt();
		for(int i=0;i<10;i++)
			K[i]=sc.nextInt();
		Arrays.sort(W);
		Arrays.sort(K);
		for(int i=7;i<10;i++) {
			w+=W[i];
			k+=K[i];
		}
		System.out.println(w+" "+k);
	}
}
