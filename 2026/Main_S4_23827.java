import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int MOD = 1000000007;
        StringTokenizer st = new StringTokenizer(br.readLine());
        long [] A = new long [N], B = new long [N+1];
        for(int i=0;i<N;i++)
            A[i] = Integer.parseInt(st.nextToken());
        B[N-1]=A[N-1];
        for(int i=N-2;i>=0;i--)
            B[i] = (B[i+1]+A[i])%MOD;
        long ans = 0;
        for(int i=0;i<N-1;i++)
            ans = (ans+A[i]*B[i+1])%MOD;
        System.out.print(ans);
    }
}