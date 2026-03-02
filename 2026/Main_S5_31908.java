import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> hm = new HashMap<>();
        HashMap<String, String> ring = new HashMap<>();
        for(int n=0;n<N;n++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String P = st.nextToken(), S = st.nextToken();
            if(!S.equals("-")) {
                hm.put(S, hm.getOrDefault(S, 0) + 1);
                ring.put(S, ring.getOrDefault(S, "")+P+" ");
            }
        }
        int ans=0;
        for(String S : hm.keySet()){
            if(hm.get(S)==2){
                ans++;
                sb.append(ring.get(S)).append("\n");
            }
        }
        System.out.println(ans);
        System.out.print(sb);
    }
}
