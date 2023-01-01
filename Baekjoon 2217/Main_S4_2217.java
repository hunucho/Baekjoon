import java.util.*;

public class Main_S4_2217 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), ans=0;
		int [] ropes = new int[n];
		for(int i=0;i<n;i++)
			ropes[i]=sc.nextInt();
		Arrays.sort(ropes);
		for(int i=0;i<n;i++)
			ans=Math.max(ans, ropes[i]*(n-i));
		System.out.println(ans);
	}
}
