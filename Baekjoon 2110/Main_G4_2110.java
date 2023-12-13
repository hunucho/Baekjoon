import java.util.*;

public class Main {
	static int N, M, ans, call;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), C = sc.nextInt();
		int[] X = new int[N];
		for (int i = 0; i < N; i++)
			X[i] = sc.nextInt();
		Arrays.sort(X);
		int left = 0, right = X[N - 1]+1, ans=0;
		while (left < right) {
			int mid = (left + right) / 2;
			int cnt=1, prev=X[0];
			for(int i=1;i<N;i++) {
				if(X[i]-prev>=mid) {
					cnt++;
					prev=X[i];
				}
			}
			if(cnt>=C) {
				ans=Math.max(ans, mid);
				left=mid+1;
				
			} else
				right=mid;
		}
		System.out.println(ans);
	}
}
