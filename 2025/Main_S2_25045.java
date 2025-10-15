import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken());
        long [] A = new long[N], B = new long[M];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++)
            A[i] = Long.parseLong(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++)
            B[i] = Long.parseLong(st.nextToken());
        Arrays.sort(A);
        Arrays.sort(B);
        long ans=0;
        for(int i=0;i<Math.min(N, M);i++){
            if(A[N-1-i]-B[i]>0)
                ans+=A[N-1-i]-B[i];
            else
                break;
        }
        System.out.println(ans);
    }
}