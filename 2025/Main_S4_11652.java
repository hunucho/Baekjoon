import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<Long, Long> hm = new HashMap<>();
        for(int i=0;i<N;i++){
            long card = Long.parseLong(br.readLine());
            hm.put(card, hm.getOrDefault(card, 0l)+1);
        }
        long max=0, maxKey=0;
        for(long i:hm.keySet()){
            long cnt = hm.get(i);
            if(cnt>max){
                max=cnt;
                maxKey=i;
            } else if(cnt==max){
                maxKey=Math.min(i, maxKey);
            }
        }
        System.out.print(maxKey);
    }
}