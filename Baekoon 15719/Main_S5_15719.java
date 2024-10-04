import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N=Integer.parseInt(br.readLine()), M=0;
        boolean [] A = new boolean[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++) {
            M=Integer.parseInt(st.nextToken());
            if(A[M])
                break;
            A[M]=true;
        }
        bw.write(M+"\n");
        bw.close();
    }
}