import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        int [] A = new int [N], B = new int [N];
        Arrays.fill(B, -1);
        StringTokenizer st = new StringTokenizer(br.readLine());
        A[0] = Integer.parseInt(st.nextToken());
        int last = A[0], s=0;
        for(int i=1;i<N;i++) {
            A[i]=Integer.parseInt(st.nextToken());
            if(A[i]!=last){
                Arrays.fill(B, s, i, i+1);
                last = A[i];
                s=i;
            }
        }
        for(int i=0;i<N;i++)
            sb.append(B[i]).append(" ");
        System.out.println(sb);
    }
}