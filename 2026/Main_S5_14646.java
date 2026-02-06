import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), ans = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<2*N;i++){
            int tmp = Integer.parseInt(st.nextToken());
            if(hs.contains(tmp))
                hs.remove(tmp);
            else
                hs.add(tmp);
            ans = Math.max(ans, hs.size());
        }
        System.out.print(ans);
    }
}