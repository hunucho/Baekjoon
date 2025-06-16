import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), K=Integer.parseInt(st.nextToken());
        long ans=0;
        PriorityQueue<Integer> pp = new PriorityQueue<>(Collections.reverseOrder()), pm=new PriorityQueue<>();
        for(int i=0;i<N;i++){
            int tmp = Integer.parseInt(br.readLine());
            if(tmp>0)
                pp.add(tmp);
            else if(tmp<0)
                pm.add(tmp);
        }
        while(pp.size()>0){
            ans+=pp.poll()*2;
            for(int i=1;i<K && pp.size()>0;i++)
                pp.poll();
        }
        while(pm.size()>0){
            ans+=pm.poll()*-2;
            for(int i=1;i<K && pm.size()>0;i++)
                pm.poll();
        }
        System.out.print(ans);
    }
}
