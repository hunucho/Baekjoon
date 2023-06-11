import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), ans = 0;
            if(N==0 && M==0)
                break;
            HashSet<Integer> hs = new HashSet<>();
            for (int i = 0; i < N; i++)
                hs.add(Integer.parseInt(br.readLine()));
            for (int i = 0; i < M; i++)
                if (hs.contains(Integer.parseInt(br.readLine())))
                    ans++;
            System.out.println(ans);
        }
    }
}
