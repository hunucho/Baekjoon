import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        long ans=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<N;i++)
            pq.add(Integer.parseInt(br.readLine()));
        for(int i=1;i<=N;i++)
            ans+=Math.abs(pq.poll()-i);
        System.out.println(ans);
    }
}