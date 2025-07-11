import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken());
        int [] score = new int [N];
        PriorityQueue<Integer> [] pq = new PriorityQueue[N];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            pq[i] = new PriorityQueue();
            for(int j=0;j<M;j++)
                pq[i].add(Integer.parseInt(st.nextToken()));
        }
        for(int m=0;m<M;m++){
            int [] tmp = new int [N];
            int max=0;
            for(int i=0;i<N;i++) {
                tmp[i] = pq[i].poll();
                max = Math.max(max, tmp[i]);
            }
            for(int i=0;i<N;i++){
                if(max==tmp[i])
                    score[i]++;
            }
        }
        int max=0;
        for(int i=0;i<N;i++)
            max = Math.max(max, score[i]);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++)
            if(score[i]==max)
                sb.append(i+1).append(" ");
        System.out.print(sb);
    }
}