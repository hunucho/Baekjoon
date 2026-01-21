import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        long ans=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<N;i++)
            pq.add(Integer.parseInt(br.readLine()));
        int cnt=1;
        while(pq.size()>0){
            int tmp =pq.poll()- cnt +1;
            if(tmp<=0)
                continue;
            ans+=tmp;
            cnt++;
        }
        System.out.print(ans);
    }
}