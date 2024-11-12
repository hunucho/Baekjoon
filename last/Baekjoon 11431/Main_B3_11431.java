import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] A = new int[N+1], B=new int[N+1];
        for(int i=1;i<=N;i++)
            A[i] = Integer.parseInt(st.nextToken());
        for(int i=1;i<=N;i++)
            B[i]=A[i]+B[i-1];
        int M=Integer.parseInt(br.readLine());
        for(int t=0;t<M;t++){
            st = new StringTokenizer(br.readLine());
            int i=Integer.parseInt(st.nextToken()), j=Integer.parseInt(st.nextToken());
            System.out.println(B[j]-B[i]+A[i]);
        }
    }
}
