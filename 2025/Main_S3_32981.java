import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int Q = Integer.parseInt(br.readLine());
        long [] dp = new long [10000005];
        int MOD = 1000000007;
        dp[1]=5;
        dp[2]=20;
        for(int i=3;i<=10000000;i++){
            dp[i]=(dp[i-1]*5)%MOD;
        }
        for(int i=0;i<Q;i++){
            int N=Integer.parseInt(br.readLine());
            sb.append(dp[N]).append("\n");
        }
        System.out.print(sb);
    }
}