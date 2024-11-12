import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken());
        TreeMap<Integer, String> tm = new TreeMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++) {
            st = new StringTokenizer(br.readLine());
            String title = st.nextToken();
            int score = Integer.parseInt(st.nextToken());
            if(!tm.containsKey(score))
                tm.put(score,title);
        }
        for(int i=0;i<M;i++){
            int tmp=Integer.parseInt(br.readLine());
            sb.append(tm.ceilingEntry(tmp).getValue()).append("\n");
        }
        System.out.println(sb.toString());
    }
}
