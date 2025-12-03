import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), Q = Integer.parseInt(st.nextToken()), ans = 0;
        int [] a = new int [N+1], acc = new int [N+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1;i<=N;i++) {
            a[i] = Integer.parseInt(st.nextToken());
            acc[i]=acc[i-1]^a[i];
        }
        for(int i=0;i<Q;i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken()), e = Integer.parseInt(st.nextToken());
            ans = ans^acc[e]^acc[s-1];
        }
        System.out.print(ans);
    }
}