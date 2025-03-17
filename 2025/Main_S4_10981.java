import java.util.*;
import java.io.*;

public class Main {
    public static class TEAM{
        public TEAM(String univ, String name, int penalty, int solved){
            this.univ=univ;
            this.name=name;
            this.penalty=penalty;
            this.solved=solved;
        }
        String univ, name;
        int solved, penalty;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), K=Integer.parseInt(st.nextToken());
        PriorityQueue<TEAM> pq = new PriorityQueue<>(new Comparator<TEAM>() {
            @Override
            public int compare(TEAM o1, TEAM o2) {
                if(o1.solved==o2.solved)
                    return o1.penalty-o2.penalty;
                return o2.solved-o1.solved;
            }
        });
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            String univ = st.nextToken(), name = st.nextToken();
            int solved = Integer.parseInt(st.nextToken()), penalty = Integer.parseInt(st.nextToken());
            pq.add(new TEAM(univ, name, penalty, solved));
        }
        StringBuilder sb = new StringBuilder();
        HashSet<String> univ = new HashSet<>();
        while(pq.size()>0 && K>0){
            TEAM tmp = pq.poll();
            if(!univ.contains(tmp.univ)) {
                sb.append(tmp.name).append("\n");
                K--;
                univ.add(tmp.univ);
            }
        }
        System.out.print(sb);
    }
}