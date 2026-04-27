import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] jumps = new int[N], dp = new int [400001];
        for(int i=0;i<N;i++)
            jumps[i] = Integer.parseInt(st.nextToken());
        for(int i=N-1;i>=0;i--){
            dp[i] = dp[i+1+jumps[i]]+1;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++)
            sb.append(dp[i]).append(" ");
        System.out.print(sb);
    }
}