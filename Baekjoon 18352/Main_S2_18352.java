import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken()), X=Integer.parseInt(st.nextToken());
        int [] dist = new int [N+1];
        Arrays.fill(dist, -1);
        ArrayList<Integer> [] edge = new ArrayList [N+1];
        for(int i=0;i<=N;i++)
            edge[i] = new ArrayList<>();
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
            edge[a].add(b);
        }

        dist[X]=0;
        Queue<Integer> pq = new LinkedList<>();
        pq.add(X);

        while(pq.size()>0){
            int cur = pq.poll();
            for(int next : edge[cur]){
                if(dist[next]>=0)
                    continue;
                dist[next]=dist[cur]+1;
                pq.add(next);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=N;i++)
            if(dist[i]==K)
                sb.append(i).append(" ");
        System.out.println(sb.length()==0?"-1":sb.toString());
    }

}