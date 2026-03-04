import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<int []> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String S = st.nextToken();
            int I = Integer.parseInt(st.nextToken()), D = Integer.parseInt(st.nextToken());
            pq.add(new int [] {I, Character.toUpperCase(S.charAt(D-1))});
        }
        StringBuilder sb = new StringBuilder();
        while(pq.size()>0){
            sb.append((char)pq.poll()[1]);
        }
        System.out.print(sb);
    }
}
