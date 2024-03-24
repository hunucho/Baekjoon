import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N=Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken());
            int [] A = new int [N], B = new int [M];
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<N;i++)
                A[i] = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<M;i++)
                B[i] = Integer.parseInt(st.nextToken());
            Arrays.sort(A);
            Arrays.sort(B);
            int i=N-1, j=M-1, ans=0;
            while(i>=0 && j>=0){
                if(B[j]>=A[i])
                    j--;
                else {
                    ans+=j+1;
                    i--;
                }
            }
            System.out.println(ans);
        }
    }
}