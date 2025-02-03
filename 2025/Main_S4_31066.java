import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N=Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken()), K=Integer.parseInt(st.nextToken()), n=N, ans=0;
            for(int i=0;N>0;i++){
                N-=M*K;
                ans++;
                if(N>0) {
                    ans++;
                    N++;
                }
                if(N==n) {
                    ans = 0;
                    break;
                }
            }
            System.out.println(ans==0?-1:ans);
        }
    }
}