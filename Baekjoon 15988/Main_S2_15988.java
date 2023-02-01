import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        long[] dp = new long[1000001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int i=4;i<=1000000;i++)
            dp[i]=(dp[i-3]+dp[i-2]+dp[i-1])%1000000009;
        for (int t = 0; t < T; t++) {
            System.out.println(dp[sc.nextInt()]);
        }
    }
}
