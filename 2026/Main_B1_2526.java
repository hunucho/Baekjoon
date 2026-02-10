import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), P = Integer.parseInt(st.nextToken()), tmp=N;
        int [] A = new int [1005];
        A[N]++;
        while(true) {
            tmp = (tmp*N)%P;
            A[tmp]++;
            if (A[tmp] > 2) {
                break;
            }
        }
        int ans=0;
        for(int i=0;i<100;i++)
            if(A[i]>=2)
                ans++;
        System.out.print(ans);
    }
}