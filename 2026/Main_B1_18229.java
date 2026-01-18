import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken()), K=Integer.parseInt(st.nextToken());
        int [][] A = new int [N][M];
        for(int i=0;i<N;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++)
                A[i][j]=Integer.parseInt(st.nextToken());
        }
        int [] sum = new int [N], cnt = new int [N];
        int i=0, j=0;
        while(sum[i]<K){
            sum[i]+=A[i][j];
            cnt[i]++;
            i++;
            if(i==N){
                i=0;
                j++;
                j%=M;
            }
        }
        System.out.printf("%d %d", i+1, cnt[i]);
    }
}