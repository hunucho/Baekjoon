import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            int N=Integer.parseInt(br.readLine()), ans=0;
            int [] arr = new int [N], dp = new int [N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0;i<N;i++)
                arr[i]=Integer.parseInt(st.nextToken());
            ans=dp[0]=arr[0];
            for(int i=1;i<N;i++) {
                if(dp[i-1]<0)
                    dp[i-1]=0;
                dp[i] = dp[i-1] + arr[i];
                ans=Math.max(ans, dp[i]);
            }
            System.out.println(ans);
        }
    }
}
/*

1
5
-1 -2 -3 -4 -5

1
5
-5 -4 -1 -2 -3

 */