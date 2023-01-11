import java.util.*;

public class Main_S5_8979 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt(), ord=1, tmp=0, ans=1;
		long [][] arr = new long [N][2];
		for (int i = 0; i < N; i++) {
			arr[i][0]=sc.nextInt();
			arr[i][1]=sc.nextLong()*1000001*1000001+sc.nextLong()*1000001+sc.nextLong();
		}
		Arrays.sort(arr, new Comparator<long[]>() {
			@Override
			public int compare(long[] o1, long[] o2) {
				if(o1[1]>o2[1])
					return -1;
				return 1;
			}
		});
		for (int i = 1; i < N; i++) {
			if(arr[i-1][1]==arr[i][1])
				tmp++;
			else {
				ord=ord+tmp+1;
				tmp=0;
			}
			if(arr[i][0]==K)
				ans=ord;
		}
		System.out.println(ans);
	}
}
