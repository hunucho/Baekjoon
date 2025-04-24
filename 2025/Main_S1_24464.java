import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int DIV = 1000000007;
        long [] dp = {1, 1, 1, 1, 1};
        for(int i=1;i<N;i++){
            long [] arr = new long [5];
            arr[0]=(dp[1]+dp[2]+dp[3]+dp[4])%DIV;
            arr[1]=(dp[0]+dp[3]+dp[4])%DIV;
            arr[2]=(dp[0]+dp[4])%DIV;
            arr[3]=(dp[0]+dp[1])%DIV;
            arr[4]=(dp[0]+dp[1]+dp[2])%DIV;
            dp=arr;
        }
        long ans = 0;
        for(int i=0;i<5;i++)
            ans=(ans+dp[i])%DIV;
        System.out.println(ans);
    }
}