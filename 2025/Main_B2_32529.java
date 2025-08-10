import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken()), ans=-1;
        int [] A = new int [N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++)
            A[i]=Integer.parseInt(st.nextToken());
        for(int i=N-1;i>=0;i--){
            M-=A[i];
            if(M<=0) {
                ans = i + 1;
                break;
            }
        }
        if(ans==-1 && M<=0)
            ans=1;
        System.out.print(ans);
    }
}