import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean ans = true;
        int T = Integer.parseInt(st.nextToken()), X=Integer.parseInt(st.nextToken());
        int N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            int K = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            boolean tmp = false;
            for(int j=0;j<K;j++){
                if(Integer.parseInt(st.nextToken())==X)
                    tmp = true;
            }
            ans&=tmp;
        }
        System.out.print(ans?"YES":"NO");
    }
}