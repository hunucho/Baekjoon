import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Long> pq = new PriorityQueue<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        while(n>0){
            if(!st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()) {
                sb.append(st.nextToken()).reverse();
                pq.add(Long.parseLong(sb.toString()));
                sb.setLength(0);
                n--;
            }
        }
        while(pq.size()>0)
            sb.append(pq.poll()).append("\n");
        System.out.print(sb);
    }
}