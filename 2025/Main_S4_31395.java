import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int [] A = new int [N], B=new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++)
            A[i] = Integer.parseInt(st.nextToken());
        for(int i=N-1;i>0;i--){
            if(A[i-1]<A[i])
                B[i-1]=B[i]+1;
        }
        long ans=0;
        for(int i=0;i<N;i++)
            ans+=B[i]+1;
        System.out.print(ans);
    }
}