import java.util.*;

public class Main_S4_1748 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), i;
		long ans = 0;
		for(i=1;i<=n;i*=10)
			ans+=(n-i+1);
		System.out.println(ans);
	}
}
