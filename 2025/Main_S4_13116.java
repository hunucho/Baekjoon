import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken()), ans = 0;
            HashSet<Integer> hs = new HashSet<>();
            while(A>0) {
                hs.add(A);
                A/=2;
            }
            while(B>0){
                int tmp=B;
                if(hs.contains(tmp))
                    ans=Math.max(ans, tmp);
                B/=2;
            }
            System.out.println(ans*10);
        }
    }
}