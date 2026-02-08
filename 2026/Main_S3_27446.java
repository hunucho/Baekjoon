import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), ans=0;
        boolean [] pages = new boolean[N+1];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++) {
            int page = Integer.parseInt(st.nextToken());
            pages[page] = true;
        }
        int last = 0;
        for(int i=1;i<=N;i++) {
            if(!pages[i]) {
                if(last==0)
                    ans +=7;
                else
                    ans+= Math.min(7, (i-last)*2);
                last = i;
            }
        }
        System.out.print(ans);
    }
}