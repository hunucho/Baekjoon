import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), K=Integer.parseInt(st.nextToken());
        long [] A = new long [N+1], B = new long [N+1];
        long ans = 0;
        st = new StringTokenizer(br.readLine());
        PriorityQueue<Long> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=1;i<=N;i++) {
            A[i] = Integer.parseInt(st.nextToken());
            B[i] = B[i-1]+A[i];
            pq.add(B[i]);
        }
        for(int i=0;i<K;i++)
            ans+=pq.poll();
        System.out.println(ans);
    }
}

