import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int [] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++)
            A[i]=Integer.parseInt(st.nextToken());
        int i=N-2;
        while(i>0){
            if(i==1) {
                A[0]--;
                A[N-1]--;
            } else {
                if(A[0]>A[N-1])
                    A[0]--;
                else
                    A[N-1]--;
            }
            i--;
        }
        System.out.println(Math.max(A[0],A[N-1]));
    }
}