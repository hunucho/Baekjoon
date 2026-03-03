import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        HashMap<String, String> hm = new HashMap<>();
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            String S = st.nextToken();
            String key = st.nextToken()+st.nextToken()+st.nextToken();
            if(hm.containsKey(key))
                hm.put(key, "?");
            else
                hm.put(key, S);
        }
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            String key = st.nextToken()+st.nextToken()+st.nextToken();
            System.out.println(hm.getOrDefault(key, "!"));
        }
    }
}
