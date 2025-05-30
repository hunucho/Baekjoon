import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        PriorityQueue<String> pq = new PriorityQueue<>();
        for(int i=0;i<N;i++){
            String name = br.readLine();
            if(name.length()==3)
                pq.add(name);
        }
        System.out.println(pq.poll());
    }
}