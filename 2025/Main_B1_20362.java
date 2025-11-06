import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        String S = st.nextToken();
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken(), chat = st.nextToken();
            if(name.equals(S)) {
                System.out.print(hm.getOrDefault(chat, 0));
                break;
            }
            else
                hm.put(chat, hm.getOrDefault(chat, 0)+1);
        }
    }
}