import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=0;t<T;t++) {
			int N=sc.nextInt(), max=-1234567, min=1234567;
			for(int n=0;n<N;n++) {
				int tmp=sc.nextInt();
				max=Math.max(max, tmp);
				min=Math.min(min, tmp);
			}
			System.out.println(min+" "+max);
		}
	}
}
