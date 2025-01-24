import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int [] A = new int [N], B = new int [N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++)
            A[i]=B[i]=Integer.parseInt(st.nextToken());
        int cntA=0, cntB=0;
        for(int i=0;i<N-1;i++){
            for(int j=+1;j<N;j++){
                if(A[j-1]>A[j]){
                    int tmp=A[j-1];
                    A[j-1]=A[j];
                    A[j]=tmp;
                    cntA++;
                }
            }
        }
        for(int i=0;i<N-1;i++){
            for(int j=+1;j<N;j++){
                if(B[j-1]<B[j]){
                    int tmp=B[j-1];
                    B[j-1]=B[j];
                    B[j]=tmp;
                    cntB++;
                }
            }
        }
        System.out.println(Math.min(cntA, cntB+1));
    }
}