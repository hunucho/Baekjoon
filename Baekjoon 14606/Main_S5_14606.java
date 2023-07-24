import java.io.*;
import java.util.*;

public class Main_S5_14606 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int [] dp = new int [11];
		for(int i=2;i<=N;i++)
			for(int j=i;j>0;j--)
				dp[i]=Math.max(dp[i], j*(i-j)+dp[j]+dp[i-j]);
		System.out.println(dp[N]);		
	}	
}
