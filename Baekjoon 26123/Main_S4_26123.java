import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), D=Integer.parseInt(st.nextToken()), max=0;
        long ans=0;
        st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> hm = new HashMap<>();
        TreeSet<Integer> ts = new TreeSet<>(Comparator.reverseOrder());
        ts.add(0);
        for(int i=0;i<N;i++) {
            int tmp = Integer.parseInt(st.nextToken());
            ts.add(tmp);
            hm.put(tmp, hm.getOrDefault(tmp, 0)+1);
        }
        for(int i=0;i<D;i++){
            int tmp = ts.pollFirst();
            if(tmp==0)
                break;
            ans+=hm.get(tmp);
            hm.put(tmp-1, hm.remove(tmp)+hm.getOrDefault(tmp-1,0));
            ts.add(tmp-1);
        }
        System.out.println(ans);
    }
}