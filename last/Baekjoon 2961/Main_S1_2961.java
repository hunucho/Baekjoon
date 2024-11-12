package silver;

import java.util.Scanner;

public class Main_S1_2961 {
	static int n, min = Integer.MAX_VALUE;
	static int[][] tastes;
	static int[] curcombi;

	public static void combination(int cnt, int start,int size) {
		if(cnt==size) {
			int s=1, b=0;
			for(int i=0;i<size;i++) {
				s*=tastes[curcombi[i]][0];
				b+=tastes[curcombi[i]][1];
			}
			if(Math.abs(s-b)<min)
				min=Math.abs(s-b);
			return;
		}
		for(int i=start;i<n;i++) {
			curcombi[cnt]=i;
			combination(cnt+1, i+1, size);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		tastes = new int[n][2];
		curcombi = new int[n];
		for (int i = 0; i < n; i++) {
			tastes[i][0] = sc.nextInt();
			tastes[i][1] = sc.nextInt();
		}
		for(int i=1;i<=n;i++)
			combination(0, 0,i);
		System.out.println(min);

	}
}