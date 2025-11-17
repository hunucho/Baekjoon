import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int [] fibo = new int [N+1], dp = new int [N+1];
        fibo[0]=fibo[1]=1;
        int i=2;
        while(i<=N){
            fibo[i] = fibo[i - 1] + fibo[i - 2];
            if(fibo[i]>N)
                break;
            dp[fibo[i]]=fibo[i-1];
            i++;
        }
        int min=0, ans=0;
        if(N%2==0)
            min = N/2;
        else
            min = 2 + (N-3)/2;
        for(i=4;i<=N;i++){
            for(int j=i/2;j<=i;j++){
                dp[i] = Math.max(dp[i], dp[i-j]+dp[j]);
            }
        }
        System.out.print(min+" "+dp[N]);
    }
}