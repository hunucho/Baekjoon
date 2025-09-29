import java.util.*;
import java.io.*;

class Main {
    static class Domino implements Comparable<Domino> {
        int X, L;
        public Domino(int x, int l){
            X=x;
            L=l;
        }

        @Override
        public int compareTo(Domino o) {
            return this.X-o.X;
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        PriorityQueue<Domino> pq = new PriorityQueue<>();
        for(int i=0;i<N;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            pq.add(new Domino(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }
        int ans=0, pos=0;
        while (pq.size()>0){
            Domino domino = pq.poll();
            int dist = domino.X+domino.L;
            if(pos<domino.X)
                ans++;
            pos=dist;
        }
        System.out.print(ans);
    }
}