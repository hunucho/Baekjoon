import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M=Integer.parseInt(st.nextToken()), K=Integer.parseInt(st.nextToken()), k = M*K;;
        int [] A = new int [N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++)
            A[i]=Integer.parseInt(st.nextToken());
        Arrays.sort(A);
        int ans=-1, cnt=0;
        for(int i=0;i<N;i++){
            cnt+=A[N-i-1];
            if(cnt>=k) {
                ans=i+1;
                break;
            }
        }
        System.out.print(ans==-1?"STRESS":ans);
    }
}