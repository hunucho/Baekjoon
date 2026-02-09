import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int [] A = new int [N], B = new int [N];
        for(int i=0;i<N;i++)
            A[i] = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(br.readLine());
        for(int m=0;m<M;m++){
            B = Arrays.copyOf(A, N);
            st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken()), R = Integer.parseInt(st.nextToken());
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            Queue<Integer> q = new LinkedList<>();
            for(int i=0;i<N;i++){
                if(L<=A[i] && A[i]<=R) {
                    q.add(i);
                    pq.add(A[i]);
                }
            }
            while(pq.size()>0){
                int idx = q.poll();
                int val = pq.poll();
                B[idx] = val;
            }
            for(int i=0;i<N;i++)
                sb.append(B[i]).append(" ");
            sb.append("\n");
        }
        System.out.print(sb);
    }
}