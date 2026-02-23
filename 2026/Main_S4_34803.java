import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int L = Integer.parseInt(st.nextToken()), N=Integer.parseInt(st.nextToken());
        HashMap<String, Integer> hm = new HashMap<>();
        String [] arr = new String [N];
        for(int i=0;i<N;i++){
            arr[i]=br.readLine();
        }
        int K = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            for(int j=0;j<=L-K;j++) {
                String tmp = arr[i].substring(j, j + K);
                hm.put(tmp, hm.getOrDefault(tmp, 0)+1);
            }
        }
        int ans=0;
        for(int tmp:hm.values())
            ans = Math.max(ans, tmp);
        System.out.print(ans);
    }
}