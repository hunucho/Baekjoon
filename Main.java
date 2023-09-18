import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine()), cnt= (int) Math.round((double)N * 0.15), sum=0, div=N-2*cnt;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0;i<N;i++)
            pq.add(Integer.parseInt(br.readLine()));
        for(int i=0;i<cnt;i++)
            pq.poll();
        for(int i=0;i<N-2*cnt;i++)
            sum += pq.poll();
        System.out.printf("%d",div<=0?0:Math.round((double)(sum)/div));
    }
}