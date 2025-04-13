import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), K=Integer.parseInt(st.nextToken()), ans = N;
        int [] A = new int [N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++)
            A[i]=Integer.parseInt(st.nextToken());
        for(int i=0;i<N;i++){
            ans = Math.min(ans, f(i, K, A));
        }
        System.out.print(ans);
    }
    public static int f(int idx, int K, int [] B){
        int [] A = Arrays.copyOf(B, B.length);
        int cnt=0;
        for(int i=idx;i>0;i--){
            if(A[i]-A[i-1]!=K) {
                cnt++;
                A[i-1]=A[i]-K;
            }
            if(A[i-1]<=0)
                return 9999;
        }
        for(int i=idx;i<A.length-1;i++){
            if(A[i+1]-A[i]!=K) {
                cnt++;
                A[i+1]=A[i]+K;
            }
        }
        return cnt;
    }
}