import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            sb.append("Case #").append(t+1).append(":");
            long N = Long.parseLong(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            HashMap<Long, Integer> hm = new HashMap<>();
            Queue<Long> q = new LinkedList<>();
            for(int i=0;i<2*N;i++) {
                long P = Long.parseLong(st.nextToken());
                q.add(P);
                hm.put(P, hm.getOrDefault(P, 0)+1);
            }
            while(q.size()>0){
                long price = q.poll();
                int cnt = hm.getOrDefault(price, 0);
                if(cnt==0)
                    continue;
                long org = price*4/3;
                if(hm.containsKey(org)){
                    sb.append(" ").append(price);
                    if(cnt==0)
                        hm.remove(price);
                    else
                        hm.put(price, cnt-1);
                    if(hm.containsKey(org)) {
                        int tmp = hm.getOrDefault(org, 0);
                        if(tmp==0)
                            hm.remove(org);
                        else
                            hm.put(org, tmp-1);
                    }
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
