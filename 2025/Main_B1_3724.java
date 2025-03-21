import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M=Integer.parseInt(st.nextToken()), N=Integer.parseInt(st.nextToken());
            String [][] arr = new String[N][M];
            for(int i=0;i<N;i++){
                st = new StringTokenizer(br.readLine());
                for(int j=0;j<M;j++)
                    arr[i][j]=st.nextToken();
            }
            BigInteger [] A = new BigInteger[M];
            for(int i=0;i<M;i++)
                A[i]=new BigInteger("1");
            for(int j=0;j<M;j++){
                for(int i=0;i<N;i++)
                    A[j]=A[j].multiply(new BigInteger(arr[i][j]));
            }
            BigInteger max = A[0];
            int ans=0;
            for(int i=0;i<M;i++)
                if(max.compareTo(A[i])<=0){
                    ans=i+1;
                    max = A[i];
                }
            System.out.println(ans);
        }
    }
}